package com.incquerylabs.iot.eventbusclient.internal;

import org.apache.log4j.Logger;
import org.openhab.core.items.ItemNotFoundException;

import com.incquerylabs.iot.eventbusclient.EventBusClient;
import com.incquerylabs.iot.ieventbusservice.IEventBusService;
import com.incquerylabs.iot.ieventbusservice.IEventBusSubscriber;;

public class EventBusSubscriber implements IEventBusSubscriber {
    private static Logger logger = Logger.getLogger(EventBusSubscriber.class);

    protected String itemName;

    protected IEventBusService eventBusService;

    public EventBusSubscriber(String itemName) {
        this.itemName = itemName;
    }

    public EventBusSubscriber(String itemName, IEventBusService eventBusService) {
        this.itemName = itemName;
        this.eventBusService = eventBusService;
    }

    @Override
    public void stateChanged(String newState) {
        logger.debug("IncQuery: " + itemName + " state changed to: " + newState);
    }

    @Override
    public void commandReceived(String command) {
        logger.debug("IncQuery: " + itemName + " received command: " + command);
        if (itemName.equals(EventBusClient.registeredItems[EventBusClient.allowPirSwitch]) && command.equals("ON")) {
            try {
                eventBusService.postCommand(EventBusClient.registeredItems[EventBusClient.mqttSwitch], "ON");
            } catch (ItemNotFoundException e) {
                logger.error("IncQuery: item not found");
            }

        }
    }

    @Override
    public String getItemName() {
        return itemName;
    }

}
