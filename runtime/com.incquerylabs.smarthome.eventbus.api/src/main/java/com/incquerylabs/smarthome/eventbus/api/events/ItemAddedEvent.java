package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;

public class ItemAddedEvent {
	private Item item;

	public ItemAddedEvent(Item item) {
		super();
		this.item = item;
	}

	public Item getItem() {
		return item;
	}
	
	public String getItemName() {
		return item.getName();
	}
}
