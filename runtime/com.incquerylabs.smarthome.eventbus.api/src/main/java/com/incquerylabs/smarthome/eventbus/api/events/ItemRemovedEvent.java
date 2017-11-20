package com.incquerylabs.smarthome.eventbus.api.events;

public class ItemRemovedEvent {
	private String itemName;

	public ItemRemovedEvent(String itemName) {
		super();
		this.itemName = itemName;
	}
	
	public String getItemName() {
		return itemName;
	}
}
