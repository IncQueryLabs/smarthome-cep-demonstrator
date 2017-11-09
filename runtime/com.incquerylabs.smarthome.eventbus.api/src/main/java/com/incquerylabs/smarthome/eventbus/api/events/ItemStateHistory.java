package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;

public class ItemStateHistory extends ItemStateBase {

    public ItemStateHistory(Item item, State newState, State oldState) {
        super(item, newState, oldState);
    }

    public ItemStateHistory(ItemStateChangedEvent event) {
        super(event.getItem(), event.getNewState(), event.getOldState());
    }
}
