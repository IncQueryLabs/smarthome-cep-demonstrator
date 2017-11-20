package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;

public class ItemStateChangedEvent extends ItemStateChangedBase implements ItemEvent {

    public ItemStateChangedEvent(Item item, State newState, State oldState) {
        super(item, newState, oldState);
    }
}
