package com.incquerylabs.iot.droolsbundle;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.types.IncreaseDecreaseType;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.library.types.OpenClosedType;
import org.eclipse.smarthome.core.library.types.PercentType;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.kie.api.builder.Results;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.eshieventbusservice.IDrlLoader;
import com.incquerylabs.iot.eshieventbusservice.IEventPublisher;
import com.incquerylabs.iot.eshieventbusservice.IEventSubscriber;

public class DroolsEventBusClient implements IEventSubscriber {
    static Logger logger = LoggerFactory.getLogger(DroolsEventBusClient.class);
    private static final String subscriberName = "Drools event bus client";

    private Object lock = new Object();
    private ConcurrentHashMap<String, FactHandle> addedItems = new ConcurrentHashMap<String, FactHandle>();
    private IDrlLoader drlLoader = null;

    private KieSession kSession;
    private volatile boolean droolsInitialized = false;

    private IEventPublisher eventPublisher = null;

    public DroolsEventBusClient() {

        logger.debug("IncQuery droolsbundle: constructor");
        logger.debug("IncQuery droolsbundle: location: " + new File("location.txt").getAbsolutePath());
    }

    private void loadDrools() {
        try {
            synchronized (lock) {
                KieHelper kieHelper = new KieHelper();

                for (Entry<String, InputStream> entry : drlLoader.getDrls()) {
                    kieHelper.addResource(
                            ResourceFactory.newInputStreamResource(entry.getValue()).setSourcePath(entry.getKey()));
                }

                Results results = kieHelper.verify();
                if (results.hasMessages(org.kie.api.builder.Message.Level.ERROR)) {
                    logger.debug("IncQuery droolsbundle: error with DRL file");
                    logger.debug("" + results.getMessages());
                    throw new IllegalStateException("### errors ###");
                }

                kSession = kieHelper.build(EventProcessingOption.STREAM).newKieSession();
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

                if (eventPublisher != null) {
                    kSession.setGlobal("openhab", eventPublisher);
                }

                droolsInitialized = true;
            }
            logger.debug("IncQuery droolsbundle: successfully loaded DRL file");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateItem(Item item) {
        synchronized (lock) {
            kSession.update(addedItems.get(item.getName()), item);
        }
        logger.info("IncQuery droolsbundle: item " + item.getName() + " updated reference in the rule engine");
    }

    @Override
    public void stateChanged(Item item, State newState, State oldState) {
        if (droolsInitialized) {
            synchronized (lock) {
                logger.debug("IncQuery droolsbundle: " + item.getName() + " state changed to: " + newState);
                ItemStateChangedEvent itemStateChangedEvent = new ItemStateChangedEvent(item, newState, oldState);

                updateItem(item);

                synchronized (lock) {
                    FactHandle handle = kSession.insert(itemStateChangedEvent);
                    kSession.fireAllRules();
                    kSession.delete(handle);
                    kSession.insert(new ItemStateHistory(itemStateChangedEvent));
                }
            }
        } else {
            // TODO log event
        }
    }

    @Override
    public void commandReceived(Item item, Command command) {
        if (droolsInitialized) {
            logger.debug("IncQuery droolsbundle: " + item.getName() + " received command: " + command);
            ItemCommandEvent itemReceivedCommand = new ItemCommandEvent(item, command);

            updateItem(item);

            synchronized (lock) {
                FactHandle handle = kSession.insert(itemReceivedCommand);
                kSession.fireAllRules();
                kSession.delete(handle);
                kSession.insert(new ItemCommandHistory(itemReceivedCommand));
            }
        } else {
            // TODO log event
        }
    }

    @Override
    public void initItems(Collection<Item> items) {
        if (droolsInitialized) {
            logger.debug("IncQuery droolsbundle: init " + items.size() + " items");
            for (Item item : items) {
                itemAdded(item);
            }
        } else {
            // TODO log event
        }
    }

    @Override
    public void itemAdded(Item item) {
        if (droolsInitialized) {
            if (addedItems.get(item.getName()) == null) {

                FactHandle handle = kSession.insert(item);
                synchronized (lock) {
                    addedItems.put(item.getName(), handle);
                }
                logger.info("IncQuery droolsbundle: added item to rule engine: " + item.getName());

            } else {
                updateItem(item);
            }

            synchronized (lock) {
                kSession.fireAllRules();
            }
        } else {
            // TODO log event
        }
    }

    @Override
    public void itemRemoved(String itemName) {
        if (droolsInitialized) {
            FactHandle handle = addedItems.get(itemName);

            if (handle != null) {
                synchronized (lock) {
                    kSession.delete(handle);
                    kSession.fireAllRules();
                }

                logger.debug("IncQuery droolsbundle: removed item from rule engine: " + itemName);
            } else {
                logger.error("IncQuery droolsbundle: tried to delete item" + itemName
                        + ", but it wasn't in the rule engine");
            }
        } else {
            // TODO log event
        }
    }

    @Override
    public void itemUpdated(Item newItem, String oldItemName) {
        if (droolsInitialized) {
            itemRemoved(oldItemName);
            itemAdded(newItem);
        }
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

    public void setDrlLoader(IDrlLoader drlLoader) {
        this.drlLoader = drlLoader;
        loadDrools();
    }

    public void unsetDrlLoader(IDrlLoader drlLoader) {
        this.drlLoader = null;
    }

    @Override
    public String getSubscriberName() {
        return subscriberName;
    }
}
