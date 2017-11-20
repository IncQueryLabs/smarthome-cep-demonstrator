package com.incquerylabs.iot.eventbus.logger;

import java.util.Collection;

import org.eclipse.smarthome.core.items.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.smarthome.eventbus.api.IEventSubscriber;
import com.incquerylabs.smarthome.eventbus.api.events.GroupItemStateChangedEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemAddedEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemCommandEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemRemovedEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemStateChangedEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemStateEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemUpdatedEvent;

public class ExampleEventSubscriber implements IEventSubscriber {
    static Logger logger = LoggerFactory.getLogger(ExampleEventSubscriber.class);

    private static final String subscriberName = "Extended event bus logger";
    
	@Override
	public void stateUpdated(ItemStateEvent event) {
		logger.info(event.toString());
	}
    
    @Override
    public void stateChanged(ItemStateChangedEvent event) {
        logger.info(event.toString());
    }
    
    @Override
    public void groupStateChanged(GroupItemStateChangedEvent event) {
        logger.info(event.toString());
    }

    @Override
    public void commandReceived(ItemCommandEvent event) {
        logger.info(event.toString());
    }

    @Override
    public void initItems(Collection<Item> items) {
        for (Item item : items) {
            logger.info("init item: " + item.getName());
        }
    }

    @Override
    public void itemAdded(ItemAddedEvent event) {
        logger.info(event.toString());

    }

    @Override
    public void itemRemoved(ItemRemovedEvent event) {
        logger.info(event.toString());

    }

    @Override
    public void itemUpdated(ItemUpdatedEvent event) {
        logger.info(event.toString());
    }

    @Override
    public String getSubscriberName() {
        return subscriberName;
    }
}
