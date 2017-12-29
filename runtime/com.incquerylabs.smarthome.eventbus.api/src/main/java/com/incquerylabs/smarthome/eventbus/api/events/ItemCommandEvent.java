package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;

public class ItemCommandEvent extends ItemCommandBase implements ItemEvent {

	public ItemCommandEvent(Item item, Command command) {
		super(item, command);
	}
}
