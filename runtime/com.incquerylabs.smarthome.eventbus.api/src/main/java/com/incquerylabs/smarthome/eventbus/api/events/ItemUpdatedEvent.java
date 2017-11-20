package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;

public class ItemUpdatedEvent {
	private Item newItem;
	private String oldItemName;
	
	public ItemUpdatedEvent(Item newItem, String oldItemName) {
		super();
		this.newItem = newItem;
		this.oldItemName = oldItemName;
	}

	public Item getNewItem() {
		return newItem;
	}

	public String getOldItemName() {
		return oldItemName;
	}
}
