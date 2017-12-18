package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;

public class GroupItemStateChangedEvent extends ItemStateChangedEvent {

	public GroupItemStateChangedEvent(Item item, State newState, State oldState) {
		super(item, newState, oldState);
	}
	
    @Override
    public String toString() {
        return String.format("%s group state changed from %s to %s", item.getName(), oldState, newState);
    }
}
