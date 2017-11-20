package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;

public class ItemStateEvent implements ItemEvent {
	protected Item item;
	protected State itemState;

	public ItemStateEvent(Item item, State itemState) {
		super();
		this.item = item;
		this.itemState = itemState;
	}

	public Item getItem() {
		return item;
	}
	
    public String getName() {
        return this.item.getName();
    }

	public State getItemState() {
		return itemState;
	}
	
    @Override
    public String toString() {
        return String.format("%s updated to %s", item.getName(), itemState);
    }
}
