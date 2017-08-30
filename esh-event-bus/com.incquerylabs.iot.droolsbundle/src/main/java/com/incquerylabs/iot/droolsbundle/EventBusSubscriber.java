package com.incquerylabs.iot.droolsbundle;

import java.io.File;
import java.io.FileInputStream;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.library.types.OpenClosedType;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.kie.api.builder.Results;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.eshieventbusservice.IEventBusService;
import com.incquerylabs.iot.eshieventbusservice.IEventBusSubscriber;

public class EventBusSubscriber implements IEventBusSubscriber {
    static Logger logger = LoggerFactory.getLogger(EventBusSubscriber.class);

    private Object lock = new Object();
    private ConcurrentHashMap<String, FactHandle> addedItems = new ConcurrentHashMap<String, FactHandle>();

    protected IEventBusService eventBusService;
    private KieSession kSession;

    public EventBusSubscriber(IEventBusService eventBusService) {

        logger.debug("IncQuery droolsbundle: constructor");
        logger.debug("IncQuery droolsbundle: location: " + new File("location.txt").getAbsolutePath());
        this.eventBusService = eventBusService;

        try {
            KieHelper kieHelper = new KieHelper();
            kieHelper.addResource(ResourceFactory.newInputStreamResource(new FileInputStream("rules\\Sample.drl")),
                    ResourceType.DRL);

            Results results = kieHelper.verify();
            if (results.hasMessages(org.kie.api.builder.Message.Level.ERROR)) {
                logger.debug("IncQuery droolsbundle: error with DRL file");
                logger.debug("" + results.getMessages());
                throw new IllegalStateException("### errors ###");
            }

            kSession = kieHelper.build(EventProcessingOption.STREAM).newKieSession();
            kSession.setGlobal("openhab", eventBusService);
            kSession.setGlobal("ON", OnOffType.ON);
            kSession.setGlobal("OFF", OnOffType.OFF);
            kSession.setGlobal("OPEN", OpenClosedType.OPEN);
            kSession.setGlobal("CLOSED", OpenClosedType.CLOSED);

            logger.debug("IncQuery droolsbundle: successfully loaded DRL file");
            logger.debug("IncQuery droolsbundle: kSession: " + kSession);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateItem(Item item) {
        kSession.update(addedItems.get(item.getName()), item);
        logger.error("IncQuery droolsbundle: item " + item.getName() + " updated reference in the rule engine");
    }

    @Override
    public void stateChanged(Item item, State newState, State oldState) {
        synchronized (lock) {
            logger.debug("IncQuery droolsbundle: " + item.getName() + " state changed to: " + newState);
            ItemStateChangedEvent itemStateChangedEvent = new ItemStateChangedEvent(item, newState, oldState);
            updateItem(item);

            FactHandle handle = kSession.insert(itemStateChangedEvent);
            kSession.fireAllRules();

            itemStateChangedEvent.setProcessed();
            kSession.update(handle, itemStateChangedEvent);
        }
    }

    @Override
    public void commandReceived(Item item, Command command) {
        synchronized (lock) {
            logger.debug("IncQuery droolsbundle: " + item.getName() + " received command: " + command);
            ItemCommandEvent itemReceivedCommand = new ItemCommandEvent(item, command);

            updateItem(item);

            FactHandle handle = kSession.insert(itemReceivedCommand);
            kSession.fireAllRules();
            itemReceivedCommand.setProcessed();
            kSession.update(handle, itemReceivedCommand);
        }
    }

    @Override
    public void initItems(Collection<Item> items) {
        logger.debug("IncQuery droolsbundle: init " + items.size() + " items");
        for (Item item : items) {
            itemAdded(item);
        }
    }

    @Override
    public void itemAdded(Item item) {

        if (addedItems.get(item.getName()) == null) {

            FactHandle handle = kSession.insert(item);
            addedItems.put(item.getName(), handle);
            logger.error("IncQuery droolsbundle: added item to rule engine: " + item.getName());

        } else {
            updateItem(item);
        }

        kSession.fireAllRules();
    }

    @Override
    public void itemRemoved(String itemName) {

        FactHandle handle = addedItems.get(itemName);

        if (handle != null) {
            kSession.delete(handle);
            kSession.fireAllRules();
            logger.debug("IncQuery droolsbundle: removed item from rule engine: " + itemName);
        } else {
            logger.error(
                    "IncQuery droolsbundle: tried to delete item" + itemName + ", but it wasn't in the rule engine");
        }
    }

    @Override
    public void itemUpdated(Item newItem, String oldItemName) {
        itemRemoved(oldItemName);
        itemAdded(newItem);
    }
}
