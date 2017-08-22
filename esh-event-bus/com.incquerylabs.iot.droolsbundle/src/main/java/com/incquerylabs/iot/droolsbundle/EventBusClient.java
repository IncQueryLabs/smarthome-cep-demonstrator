package com.incquerylabs.iot.droolsbundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.eshieventbusservice.IEventBusService;
import com.incquerylabs.iot.eshieventbusservice.IEventBusSubscriber;

public class EventBusClient {
    static Logger logger = LoggerFactory.getLogger(EventBusClient.class);

    private IEventBusService eventBusService;
    private IEventBusSubscriber eventBusSubscriber;

    public void activate() {

        logger.debug("IncQuery: Activating event bus client.");
    }

    public void deactivate() {
        logger.debug("IncQuery: Deactivating event bus client.");
    }

    public void setEventBusService(IEventBusService eventBusService) {
        this.eventBusService = eventBusService;
        logger.debug("IncQuery: registered event bus service.");

        eventBusSubscriber = new EventBusSubscriber(eventBusService);
        eventBusService.setSubscriber(eventBusSubscriber);
        logger.trace("IncQuery: registered event bus subscriber.");
    }

    public void unsetEventBusService(IEventBusService eventBusService) {
        eventBusService.unsetSubscriber(eventBusSubscriber);
        logger.trace("IncQuery: unregistered event bus subscriber.");

        this.eventBusService = null;
        logger.debug("IncQuery: unregistered event bus service.");
    }
}
