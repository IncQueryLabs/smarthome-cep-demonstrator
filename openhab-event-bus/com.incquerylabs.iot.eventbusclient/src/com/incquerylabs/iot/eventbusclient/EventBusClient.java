package com.incquerylabs.iot.eventbusclient;

import org.apache.log4j.Logger;

import com.incquerylabs.iot.eventbusclient.internal.EventBusSubscriber;
import com.incquerylabs.iot.ieventbusservice.IEventBusService;

public class EventBusClient {
    private static Logger logger = Logger.getLogger(EventBusClient.class);

    private IEventBusService eventBusService;

    public static final int allowPirSwitch = 0;
    public static final int pirSwitch = 1;
    public static final int mqttSwitch = 2;

    public static final String[] registeredItems = { "allowPirSwitch", "mqttPir", "mqttSwitch" };

    public void activate() {
        logger.debug("IncQuery: Activating event bus client.");

    }

    public void deactivate() {
        logger.debug("IncQuery: Deactivating event bus client.");
    }

    public void setEventBusService(IEventBusService eventBusService) {
        this.eventBusService = eventBusService;
        logger.debug("IncQuery: registered event bus service.");

        for (String itemName : registeredItems) {
            eventBusService.registerSubscriber(new EventBusSubscriber(itemName, eventBusService));
            logger.trace("IncQuery: registered event bus subscriber.");
        }
    }

    public void unsetEventBusService(IEventBusService eventBusService) {

        for (String itemName : registeredItems) {
            eventBusService.unregisterSubscriber(new EventBusSubscriber(itemName, eventBusService));
            logger.trace("IncQuery: unregistered event bus subscriber.");
        }

        this.eventBusService = null;
        logger.debug("IncQuery: unregistered event bus service.");
    }

}
