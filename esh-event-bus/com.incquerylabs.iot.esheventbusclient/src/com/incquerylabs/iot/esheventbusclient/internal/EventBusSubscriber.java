package com.incquerylabs.iot.esheventbusclient.internal;

import java.util.Collection;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.esheventbusclient.EventBusClient;
import com.incquerylabs.iot.eshieventbusservice.IEventBusService;
import com.incquerylabs.iot.eshieventbusservice.IEventBusSubscriber;

public class EventBusSubscriber implements IEventBusSubscriber {
    static Logger logger = LoggerFactory.getLogger(EventBusClient.class);

    protected IEventBusService eventBusService;

    public EventBusSubscriber(IEventBusService eventBusService) {
        this.eventBusService = eventBusService;
    }

    @Override
    public void stateChanged(Item item, State newState, State olsState) {
        logger.debug("IncQuery: " + item.getName() + " state changed to: " + newState);
    }

    @Override
    public void commandReceived(Item item, Command command) {
        if (item.getName().equals(EventBusClient.registeredItems[EventBusClient.mqttPir])
                || item.getName().equals(EventBusClient.registeredItems[EventBusClient.allowPirSwitch])) {
            eventBusService.postCommand(EventBusClient.registeredItems[EventBusClient.mqttSwitch], OnOffType.ON);
        }
        logger.debug("IncQuery: " + item.getName() + " received command: " + command);
    }

    @Override
    public void initItems(Collection<Item> items) {
        for (Item item : items) {
            logger.debug("IncQuery: init item: " + item.getName());
        }
    }

    @Override
    public void itemAdded(Item item) {
        // TODO Auto-generated method stub

    }

    @Override
    public void itemRemoved(String itemName) {
        // TODO Auto-generated method stub

    }

    @Override
    public void itemUpdated(Item newItem, String oldItemName) {
        // TODO Auto-generated method stub

    }
}
