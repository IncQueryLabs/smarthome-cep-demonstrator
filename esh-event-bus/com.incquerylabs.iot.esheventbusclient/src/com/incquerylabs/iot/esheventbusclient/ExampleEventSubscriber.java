package com.incquerylabs.iot.esheventbusclient;

import java.util.Collection;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.eshieventbusservice.IEventSubscriber;

public class ExampleEventSubscriber implements IEventSubscriber {
    static Logger logger = LoggerFactory.getLogger(ExampleEventSubscriber.class);

    private static final String subscriberName = "example event subscriber";

    @Override
    public void stateChanged(Item item, State newState, State olsState) {
        logger.info("IncQuery: " + item.getName() + " state changed to: " + newState);
    }

    @Override
    public void commandReceived(Item item, Command command) {
        logger.info("IncQuery: " + item.getName() + " received command: " + command);
    }

    @Override
    public void initItems(Collection<Item> items) {
        for (Item item : items) {
            logger.info("IncQuery: init item: " + item.getName());
        }
    }

    @Override
    public void itemAdded(Item item) {
        logger.info("IncQuery: added item " + item.getName());

    }

    @Override
    public void itemRemoved(String itemName) {
        logger.info("IncQuery: removed item " + itemName);

    }

    @Override
    public void itemUpdated(Item newItem, String oldItemName) {
        logger.info("IncQuery: updated item " + newItem.getName());
    }

    @Override
    public String getSubscriberName() {
        return subscriberName;
    }
}
