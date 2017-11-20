package com.incquerylabs.smarthome.eventbus.api.events;

public class ItemRemovedEvent implements ItemEvent {
	private String itemName;

	public ItemRemovedEvent(String itemName) {
		super();
		this.itemName = itemName;
	}
	
	public String getName() {
		return itemName;
	}
	
    @Override
    public String toString() {
        return "Item '" + itemName + "' has been removed.";
    }
}
