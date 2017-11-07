package com.incquerylabs.smarthome.eventbusservice.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;

public class ItemCommandEvent extends ItemCommandBase {

	public ItemCommandEvent(Item item, Command command) {
		super(item, command);
	}
}
