package org.eclipse.smarthome.binding.incqueryeventbus.internal;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.smarthome.core.events.Event;
import org.eclipse.smarthome.core.events.EventFilter;
import org.eclipse.smarthome.core.events.EventPublisher;
import org.eclipse.smarthome.core.events.EventSubscriber;
import org.eclipse.smarthome.core.items.events.ItemAddedEvent;
import org.eclipse.smarthome.core.items.events.ItemCommandEvent;
import org.eclipse.smarthome.core.items.events.ItemEventFactory;
import org.eclipse.smarthome.core.items.events.ItemRemovedEvent;
import org.eclipse.smarthome.core.items.events.ItemStateChangedEvent;
import org.eclipse.smarthome.core.items.events.ItemStateEvent;
import org.eclipse.smarthome.core.items.events.ItemUpdatedEvent;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventBridge implements EventSubscriber {
    static Logger logger = LoggerFactory.getLogger(EventBridge.class);
    /**
     * The constant {@link #ALL_EVENT_TYPES} must be returned by the {@link #getSubscribedEventTypes()} method, if the
     * event subscriber should subscribe to all event types.
     */
    public static String ALL_EVENT_TYPES = "ALL";

    public static final String allowPirSwitch = "smarthome/items/dandridbinding_dandrid_38f61f87_allow_pir_switch/command";
    public static final String mqttSwitch = "dandridbinding_dandrid_38f61f87_mqtt_switch";
    public static final String onPayload = "{\"type\":\"OnOff\",\"value\":\"ON\"}";
    public static final String offPayload = "{\"type\":\"OnOff\",\"value\":\"ON\"}";

    private EventPublisher eventPublisher;

    public void setEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
        logger.info("IncQuery: set Event publisher");
    }

    public void unsetEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = null;
        logger.info("IncQuery: unset Event publisher");
    }

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
     * Gets an {@link EventFilter} in order to receive specific events if the filter applies. If there is no
     * filter all subscribed event types are received.
     *
     * @return the event filter, or null
     */
    @Override
    public EventFilter getEventFilter() {

        return null;
    }

    /**
     * Callback method for receiving {@link Event}s from the Eclipse SmartHome event bus. This method is called for
     * every event where the event subscriber is subscribed to and the event filter applies.
     *
     * @param event the received event (not null)
     */
    @Override
    public void receive(Event event) {
        if (event.getType().equals(ItemCommandEvent.TYPE) && event.getTopic().equals(allowPirSwitch)) {
            ItemCommandEvent eshEvent = ItemEventFactory.createCommandEvent(mqttSwitch, OnOffType.ON);
            eventPublisher.post(eshEvent);
        }
        logger.info("IncQuery: received event, type: " + event.getType() + " topic: " + event.getTopic() + " payload: "
                + event.getPayload());
    }
}
