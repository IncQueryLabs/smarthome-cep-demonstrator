package com.incquerylabs.smarthome.eventbusservice.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;

public class ItemStateChangedEvent extends ItemStateBase {

    public ItemStateChangedEvent(Item item, State newState, State oldState) {
        super(item, newState, oldState);
    }
}
