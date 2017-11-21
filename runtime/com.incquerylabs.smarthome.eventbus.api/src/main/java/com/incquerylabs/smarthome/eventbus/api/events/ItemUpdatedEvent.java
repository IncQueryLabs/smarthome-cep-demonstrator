package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;

public class ItemUpdatedEvent {
    protected final Item newItem;
    protected final String oldItemName;
	
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
	
    @Override
    public String toString() {
        return "Item '" + oldItemName + "' has been updated.";
    }
}
