package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;

public class ItemStateChangedHistory extends ItemStateChangedBase implements ItemEventHistory {

    public ItemStateChangedHistory(Item item, State newState, State oldState) {
        super(item, newState, oldState);
    }

    public ItemStateChangedHistory(ItemStateChangedEvent event) {
        super(event.getItem(), event.getNewState(), event.getOldState());
    }
}
