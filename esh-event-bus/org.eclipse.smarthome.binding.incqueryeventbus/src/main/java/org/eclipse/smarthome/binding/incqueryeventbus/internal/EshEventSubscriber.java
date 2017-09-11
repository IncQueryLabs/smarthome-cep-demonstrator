package org.eclipse.smarthome.binding.incqueryeventbus.internal;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.smarthome.core.events.Event;
import org.eclipse.smarthome.core.events.EventFilter;
import org.eclipse.smarthome.core.events.EventSubscriber;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemNotFoundException;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.items.events.ItemAddedEvent;
import org.eclipse.smarthome.core.items.events.ItemCommandEvent;
import org.eclipse.smarthome.core.items.events.ItemRemovedEvent;
import org.eclipse.smarthome.core.items.events.ItemStateChangedEvent;
import org.eclipse.smarthome.core.items.events.ItemStateEvent;
import org.eclipse.smarthome.core.items.events.ItemUpdatedEvent;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.eshieventbusservice.IEventSubscriber;

public class EshEventSubscriber implements EventSubscriber {
    static Logger logger = LoggerFactory.getLogger(EshEventSubscriber.class);

    private ItemRegistry itemRegistry;
    private LinkedList<IEventSubscriber> eventSubscribers = new LinkedList<IEventSubscriber>();

    @Override
    public Set<String> getSubscribedEventTypes() {
        Set<String> types = new HashSet<>(6);

        types.add(ItemCommandEvent.TYPE);
        types.add(ItemStateEvent.TYPE);
        types.add(ItemStateChangedEvent.TYPE);
        types.add(ItemUpdatedEvent.TYPE);
        types.add(ItemAddedEvent.TYPE);
        types.add(ItemRemovedEvent.TYPE);
        return types;
    }

    @Override
    public EventFilter getEventFilter() {
        return null;
    }

    @Override
    public void receive(Event event) {

        try {
            if (event instanceof ItemCommandEvent) {

                itemCommandEvent((ItemCommandEvent) event);

            } else if (event instanceof ItemStateChangedEvent) {

                itemStateChangedEvent((ItemStateChangedEvent) event);

            } else if (event instanceof ItemAddedEvent) {

                itemAddedEvent((ItemAddedEvent) event);

            } else if (event instanceof ItemRemovedEvent) {

                itemRemovedEvent((ItemRemovedEvent) event);

            } else if (event instanceof ItemUpdatedEvent) {

                itemUpdatedEvent((ItemUpdatedEvent) event);

            } else {

                logger.debug("IncQuery: received event, type: " + event.getType() + " topic: " + event.getTopic()
                        + " payload: " + event.getPayload());
            }
        } catch (ItemNotFoundException e) {
            logger.error("IncQuery: " + e.getMessage());
        }
    }

    private void itemCommandEvent(ItemCommandEvent event) throws ItemNotFoundException {
        String itemName = event.getItemName();
        Command command = event.getItemCommand();

        Item item = itemRegistry.getItem(itemName);
        for (IEventSubscriber subscriber : eventSubscribers) {
            subscriber.commandReceived(item, command);

        }
        logger.debug("IncQuery: " + event);
    }

    private void itemStateChangedEvent(ItemStateChangedEvent event) throws ItemNotFoundException {

        String itemName = event.getItemName();
        State state = event.getItemState();
        State oldState = event.getOldItemState();

        Item item = itemRegistry.getItem(itemName);

        for (IEventSubscriber subscriber : eventSubscribers) {
            subscriber.stateChanged(item, state, oldState);
        }
        logger.debug("IncQuery: " + event);
    }

    private void itemAddedEvent(ItemAddedEvent event) throws ItemNotFoundException {
        String itemName = event.getItem().name;
        Item item = itemRegistry.getItem(itemName);

        for (IEventSubscriber subscriber : eventSubscribers) {
            subscriber.itemAdded(item);
        }
        logger.debug("IncQuery: " + event);
    }

    private void itemRemovedEvent(ItemRemovedEvent event) {
        String itemName = event.getItem().name;

        for (IEventSubscriber subscriber : eventSubscribers) {
            subscriber.itemRemoved(itemName);
        }
        logger.debug("IncQuery: " + event);
    }

    private void itemUpdatedEvent(ItemUpdatedEvent event) throws ItemNotFoundException {
        String itemName = event.getItem().name;
        String oldItemName = event.getOldItem().name;

        Item item = itemRegistry.getItem(itemName);

        for (IEventSubscriber subscriber : eventSubscribers) {
            subscriber.itemUpdated(item, oldItemName);
        }
        logger.debug("IncQuery: " + event);
    }

    public synchronized void setSubscriber(IEventSubscriber eventSubscriber) {
        if (!eventSubscribers.contains(eventSubscriber)) {
            eventSubscribers.add(eventSubscriber);
            logger.info("IncQuery: set event subscriber " + eventSubscriber.getSubscriberName());
        }
    }

    public synchronized void unsetSubscriber(IEventSubscriber eventSubscriber) {
        if (eventSubscribers.remove(eventSubscriber)) {
            logger.info("IncQuery: removed event subscriber " + eventSubscriber.getSubscriberName());
        }
    }

    public void setItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = itemRegistry;
        logger.info("IncQuery: set item registry");
    }

    public void unsetItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = null;
        logger.info("IncQuery: unset item registry");
    }
}
