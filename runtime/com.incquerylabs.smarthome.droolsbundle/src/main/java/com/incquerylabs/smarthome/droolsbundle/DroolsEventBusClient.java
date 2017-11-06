package com.incquerylabs.smarthome.droolsbundle;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.types.DateTimeType;
import org.eclipse.smarthome.core.library.types.IncreaseDecreaseType;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.library.types.OpenClosedType;
import org.eclipse.smarthome.core.library.types.PercentType;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.eclipse.smarthome.core.types.UnDefType;
import org.kie.api.KieServices;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.conf.ClockTypeOption;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.builder.DecisionTableConfiguration;
import org.kie.internal.builder.DecisionTableInputType;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.smarthome.eventbusservice.IRuleLoader;
import com.incquerylabs.smarthome.eventbusservice.RuleTemplateConfiguration;
import com.incquerylabs.smarthome.eventbusservice.DrlConfiguration;
import com.incquerylabs.smarthome.eventbusservice.DtableConfiguration;
import com.incquerylabs.smarthome.eventbusservice.IEventPublisher;
import com.incquerylabs.smarthome.eventbusservice.IEventSubscriber;

public class DroolsEventBusClient implements IEventSubscriber {
    static Logger logger = LoggerFactory.getLogger(DroolsEventBusClient.class);
    private static final String subscriberName = "Drools event bus client ";

    private HomeioSessionClock homeioSessionClock = null;

    private Object lock = new Object();
    private ConcurrentHashMap<String, FactHandle> addedItems = new ConcurrentHashMap<String, FactHandle>();
    private IRuleLoader ruleLoader = null;

    private KieSession kSession;
    private volatile boolean droolsInitialized = false;

    private IEventPublisher eventPublisher = null;

    @Override
    public void stateChanged(Item item, State newState, State oldState) {
        if (droolsInitialized) {
            if (item.getName().equals("HomeIO_Date")) {
                homeioSessionClock.newHomeioTime(item);
            } else {
                homeioSessionClock.advanceClock();
            }

            updateItem(item);

            ItemStateChangedEvent itemStateChangedEvent = new ItemStateChangedEvent(item, newState, oldState);
            synchronized (lock) {
                FactHandle handle = kSession.insert(itemStateChangedEvent);
                kSession.fireAllRules();
                kSession.delete(handle);
                kSession.insert(new ItemStateHistory(itemStateChangedEvent));
            }
            logger.info(subscriberName + item.getName() + " state changed to: " + newState + " time stamp: "
                    + homeioSessionClock.getHomeioTime());
        }
    }

    @Override
    public void commandReceived(Item item, Command command) {
        if (droolsInitialized) {
            homeioSessionClock.advanceClock();

            ItemCommandEvent itemReceivedCommand = new ItemCommandEvent(item, command);

            synchronized (lock) {
                FactHandle handle = kSession.insert(itemReceivedCommand);
                kSession.fireAllRules();
                kSession.delete(handle);
                kSession.insert(new ItemCommandHistory(itemReceivedCommand));
            }
            logger.debug(subscriberName + item.getName() + " received command: " + command);
        }
    }

    @Override
    public void initItems(Collection<Item> items) {
        if (droolsInitialized) {
            homeioSessionClock.advanceClock();
            logger.debug(subscriberName + items.size() + " items");
            for (Item item : items) {
                itemAdded(item);
            }
        }
    }

    @Override
    public void itemAdded(Item item) {
        if (droolsInitialized) {
            homeioSessionClock.advanceClock();
            if (addedItems.get(item.getName()) == null) {

                FactHandle handle = null;

                synchronized (lock) {
                    item.getType();
                    if (item.getType().equals("DateTime")) {
                        if (item.getState() instanceof UnDefType) {
                            handle = kSession.insert(new DateTime(item.getName(), new Date(0)));
                        } else {
                            handle = kSession.insert(new DateTime(item.getName(),
                                    ((DateTimeType) item.getState()).getCalendar().getTime()));
                        }
                    } else {
                        handle = kSession.insert(item);
                    }
                    addedItems.put(item.getName(), handle);
                }
                logger.info(subscriberName + "added item to rule engine: " + item.getName());

            } else {
                updateItem(item);
            }

            synchronized (lock) {
                kSession.fireAllRules();
            }
        }
    }

    @Override
    public void itemRemoved(String itemName) {
        if (droolsInitialized) {
            homeioSessionClock.advanceClock();
            FactHandle handle = addedItems.get(itemName);

            if (handle != null) {
                synchronized (lock) {
                    kSession.delete(handle);
                    kSession.fireAllRules();
                }

                logger.debug(subscriberName + "removed item from rule engine: " + itemName);
            } else {
                logger.error("IncQuery droolsbundle: tried to delete item" + itemName
                        + ", but it wasn't in the rule engine");
            }
        }
    }

    @Override
    public void itemUpdated(Item newItem, String oldItemName) {
        if (droolsInitialized) {
            itemRemoved(oldItemName);
            itemAdded(newItem);
        }
    }

    private void updateItem(Item item) {
        synchronized (lock) {
            if (item.getType().equals("DateTime")) {
                kSession.delete(addedItems.get(item.getName()));
                addedItems.put(item.getName(), kSession.insert(
                        new DateTime(item.getName(), ((DateTimeType) item.getState()).getCalendar().getTime())));
            } else {
                kSession.update(addedItems.get(item.getName()), item);
            }
        }
        logger.info(subscriberName + "item " + item.getName() + " updated reference in the rule engine");
    }

    public void setEventPublisher(IEventPublisher eventPublisher) {
        synchronized (lock) {
            if (droolsInitialized) {
                kSession.setGlobal("openhab", eventPublisher);
            } else {
                this.eventPublisher = eventPublisher;
            }
        }
    }

    public void unsetEventPublisher(IEventPublisher eventPublisher) {
        synchronized (lock) {
            kSession.setGlobal("openhab", null);
        }
    }

    public void setRuleLoader(IRuleLoader ruleLoader) {
        this.ruleLoader = ruleLoader;
        loadDrools();
    }

    public void unsetRuleLoader(IRuleLoader ruleLoader) {
        this.ruleLoader = null;
    }

    @Override
    public String getSubscriberName() {
        return subscriberName;
    }

    private void addDrls(KnowledgeBuilder kbuilder) {
    	
    	List<DrlConfiguration> drls = ruleLoader.getDrls();
    	if( drls != null ) {
    		for (DrlConfiguration drlConf : drls) {
    			kbuilder.add(ResourceFactory.newInputStreamResource(drlConf.getDrl()).setSourcePath(drlConf.getPath()),
    					ResourceType.DRL);
    		}
    	}
    	
    	List<DtableConfiguration> dtables = ruleLoader.getDtables();
    	if( dtables != null ) {
    		for (DtableConfiguration dtableConf : dtables) {
    			kbuilder.add(ResourceFactory.newInputStreamResource(dtableConf.getDtable()).setSourcePath(dtableConf.getPath()), ResourceType.DTABLE);
    		}
    	}
        
    	List<RuleTemplateConfiguration> ruleTeamplates = ruleLoader.getRuleTemplates();
    	if( ruleTeamplates != null ) {
    		for (RuleTemplateConfiguration ruleTeamplateConf : ruleTeamplates) {
    			for(DrlConfiguration drlConf : ruleTeamplateConf.getTemplateRules()) {
    				DecisionTableConfiguration dtableconfiguration = KnowledgeBuilderFactory.newDecisionTableConfiguration();
    				
    				dtableconfiguration.setInputType(DecisionTableInputType.XLSX);
    				dtableconfiguration.setWorksheetName(ruleTeamplateConf.getWorksheetName());
    				dtableconfiguration.addRuleTemplateConfiguration(ResourceFactory
    						.newInputStreamResource(drlConf.getDrl()).setSourcePath(drlConf.getPath()), 
    						ruleTeamplateConf.getStartRow(),
    						ruleTeamplateConf.getStartColumn());
    				
    				kbuilder.add(ResourceFactory.newInputStreamResource(
    						ruleTeamplateConf.getTemplateData()).setSourcePath(ruleTeamplateConf.getPath()), 
    						ResourceType.DTABLE,
    						dtableconfiguration);
    			}
    		}
    	}
    }
    
    private void loadDrools() {
        try {
            synchronized (lock) {
                KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

                addDrls(kbuilder);

                KieSessionConfiguration config = KieServices.Factory.get().newKieSessionConfiguration();
                config.setOption(ClockTypeOption.get("pseudo"));

                kSession = kbuilder.newKieBase().newKieSession(config, null);
                homeioSessionClock = new HomeioSessionClock(kSession.getSessionClock());

                initGlobals();

                droolsInitialized = true;
            }
            logger.debug(subscriberName + "successfully loaded DRL file");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initGlobals() {
        kSession.setGlobal("ON", OnOffType.ON);
        kSession.setGlobal("OFF", OnOffType.OFF);
        kSession.setGlobal("OPEN", OpenClosedType.OPEN);
        kSession.setGlobal("CLOSED", OpenClosedType.CLOSED);
        kSession.setGlobal("ZERO", PercentType.ZERO);
        kSession.setGlobal("HUNDRED", PercentType.HUNDRED);
        kSession.setGlobal("INCREASE", IncreaseDecreaseType.INCREASE);
        kSession.setGlobal("DECREASE", IncreaseDecreaseType.DECREASE);

        kSession.setGlobal("ARMED", OpenClosedType.OPEN);
        kSession.setGlobal("DEARMED", OpenClosedType.CLOSED);
        kSession.setGlobal("BRIGHTNESS", OpenClosedType.CLOSED);
        kSession.setGlobal("DARKNESS", OpenClosedType.OPEN);

        kSession.setGlobal("MOTION", OpenClosedType.OPEN);
        kSession.setGlobal("NOMOTION", OpenClosedType.CLOSED);
        kSession.setGlobal("DOOR_OPENED", OpenClosedType.CLOSED);
        kSession.setGlobal("DOOR_CLOSED", OpenClosedType.OPEN);

        kSession.setGlobal("MONDAY", Calendar.MONDAY);
        kSession.setGlobal("TUESDAY", Calendar.TUESDAY);
        kSession.setGlobal("WEDNESDAY", Calendar.WEDNESDAY);
        kSession.setGlobal("THURSDAY", Calendar.THURSDAY);
        kSession.setGlobal("FRIDAY", Calendar.FRIDAY);
        kSession.setGlobal("SATURDAY", Calendar.SATURDAY);
        kSession.setGlobal("SUNDAY", Calendar.SUNDAY);

        if (eventPublisher != null) {
            kSession.setGlobal("openhab", eventPublisher);
        }
    }

}
