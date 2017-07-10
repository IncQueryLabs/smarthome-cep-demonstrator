package org.eclipse.smarthome.binding.incqueryeventbus.internal;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.eclipse.smarthome.core.events.Event;
import org.eclipse.smarthome.core.events.EventFilter;
import org.eclipse.smarthome.core.events.EventPublisher;
import org.eclipse.smarthome.core.events.EventSubscriber;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemNotFoundException;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.items.events.ItemAddedEvent;
import org.eclipse.smarthome.core.items.events.ItemCommandEvent;
import org.eclipse.smarthome.core.items.events.ItemEventFactory;
import org.eclipse.smarthome.core.items.events.ItemRemovedEvent;
import org.eclipse.smarthome.core.items.events.ItemStateChangedEvent;
import org.eclipse.smarthome.core.items.events.ItemStateEvent;
import org.eclipse.smarthome.core.items.events.ItemUpdatedEvent;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.eshieventbusservice.IEventBusService;
import com.incquerylabs.iot.eshieventbusservice.IEventBusSubscriber;

public class EventBridge implements EventSubscriber, IEventBusService {
    static Logger logger = LoggerFactory.getLogger(EventBridge.class);
    /**
     * The constant {@link #ALL_EVENT_TYPES} must be returned by the {@link #getSubscribedEventTypes()} method, if the
     * event subscriber should subscribe to all event types.
     */
    public static String ALL_EVENT_TYPES = "ALL";

    private ItemRegistry itemRegistry;
    private EventPublisher eventPublisher;
    private CopyOnWriteArraySet<IEventBusSubscriber> eventBusSubscribers = new CopyOnWriteArraySet<IEventBusSubscriber>();

    /**
     * Gets the event types to which the event subscriber is subscribed to.
     *
     * @return subscribed event types (not null)
     */
    @Override
    public Set<String> getSubscribedEventTypes() {
        Set<String> types = new HashSet<>(6);
        // types.add(ALL_EVENT_TYPES);

        types.add(ItemCommandEvent.TYPE);
        types.add(ItemStateEvent.TYPE);
        types.add(ItemStateChangedEvent.TYPE);
        types.add(ItemUpdatedEvent.TYPE);
        types.add(ItemAddedEvent.TYPE);
        types.add(ItemRemovedEvent.TYPE);

        return types;
    }

    /**
     * Callback method for receiving {@link Event}s from the Eclipse SmartHome event bus. This method is called for
     * every event where the event subscriber is subscribed to and the event filter applies.
     *
     * @param event the received event (not null)
     */
    @Override
    public void receive(Event event) {
        if (event instanceof ItemCommandEvent) {

            ItemCommandEvent icEvent = (ItemCommandEvent) event;
            String itemName = icEvent.getItemName();
            Command command = icEvent.getItemCommand();

            for (IEventBusSubscriber subscriber : eventBusSubscribers) {
                try {
                    subscriber.commandReceived(itemRegistry.getItem(itemName), command);
                } catch (ItemNotFoundException e) {
                    logger.error("IncQuery: item not found {}, message: ", itemName, e.toString());
                }

            }
            logger.info("IncQuery: {} received command {}", itemName, command);

        } else if (event instanceof ItemStateChangedEvent) {

            ItemStateChangedEvent isEvent = (ItemStateChangedEvent) event;
            String itemName = isEvent.getItemName();
            State state = isEvent.getItemState();
            State oldState = isEvent.getOldItemState();

            for (IEventBusSubscriber subscriber : eventBusSubscribers) {
                try {
                    subscriber.stateChanged(itemRegistry.getItem(itemName), state, oldState);
                } catch (ItemNotFoundException e) {
                    logger.error("IncQuery: item not found {}, message: ", itemName, e.toString());
                }
            }
            logger.info("IncQuery: {} changed state from {} to {}", itemName, oldState, state);
        } else {
            logger.info("IncQuery: received event, type: " + event.getType() + " topic: " + event.getTopic()
                    + " payload: " + event.getPayload());
        }

    }

    @Override
    public void postCommand(String itemName, Command command) {
        eventPublisher.post(ItemEventFactory.createCommandEvent(itemName, command));
        logger.info("IncQuery: posted command to item: " + itemName + " " + command);
    }

    @Override
    public void postCommand(Item item, Command command) {
        postCommand(item.getName(), command);
    }

    public void setEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
        logger.info("IncQuery: set Event publisher");
    }

    public void unsetEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = null;
        logger.info("IncQuery: unset Event publisher");
    }

    public void setItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = itemRegistry;
        logger.info("IncQuery: set item registry");
    }

    public void unsetItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = null;
        logger.info("IncQuery: unset item registry");
    }

    @Override
    public void setSubscriber(IEventBusSubscriber eventSubscriber) {
        if (!eventBusSubscribers.contains(eventSubscriber)) {
            eventBusSubscribers.add(eventSubscriber);
            logger.info("IncQuery: set event subscriber");
        }
    }

    @Override
    public void unsetSubscriber(IEventBusSubscriber eventSubscriber) {
        if (eventBusSubscribers.remove(eventSubscriber)) {
            logger.info("IncQuery: set event subscriber");
        }
    }

    /**
     * Gets an {@link EventFilter} in order to receive specific events if the filter applies. If there is no
     * filter all subscribed event types are received.
     *
     * @return the event filter, or null
     */
    @Override
    public EventFilter getEventFilter() {
        return null;
    }

}
