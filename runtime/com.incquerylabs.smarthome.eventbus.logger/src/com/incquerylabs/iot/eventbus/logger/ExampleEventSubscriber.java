package com.incquerylabs.iot.eventbus.logger;

import java.util.Collection;

import org.eclipse.smarthome.core.items.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.smarthome.eventbus.api.IEventSubscriber;
import com.incquerylabs.smarthome.eventbus.api.events.ItemCommandEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemStateChangedEvent;

public class ExampleEventSubscriber implements IEventSubscriber {
    static Logger logger = LoggerFactory.getLogger(ExampleEventSubscriber.class);

    private static final String subscriberName = "IncQuery event bus logger ";

    @Override
    public void stateChanged(ItemStateChangedEvent itemStateChangedEvent) {
        logger.info(subscriberName + itemStateChangedEvent);
    }

    @Override
    public void commandReceived(ItemCommandEvent itemCommandEvent) {
        logger.info(subscriberName + itemCommandEvent);
    }

    @Override
    public void initItems(Collection<Item> items) {
        for (Item item : items) {
            logger.info(subscriberName + "init item: " + item.getName());
        }
    }

    @Override
    public void itemAdded(Item item) {
        logger.info(subscriberName + "added item " + item.getName());

    }

    @Override
    public void itemRemoved(String itemName) {
        logger.info(subscriberName + "removed item " + itemName);

    }

    @Override
    public void itemUpdated(Item newItem, String oldItemName) {
        logger.info(subscriberName + "updated item " + newItem.getName());
    }

    @Override
    public String getSubscriberName() {
        return subscriberName;
    }
}
