package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;

public class ItemAddedEvent implements ItemEvent {
    protected final Item item;

	public ItemAddedEvent(Item item) {
		super();
		this.item = item;
	}

	public Item getItem() {
		return item;
	}
	
	public String getName() {
		return item.getName();
	}
	
    @Override
    public String toString() {
        return "Item '" + item.getName() + "' has been added.";
    }
}
