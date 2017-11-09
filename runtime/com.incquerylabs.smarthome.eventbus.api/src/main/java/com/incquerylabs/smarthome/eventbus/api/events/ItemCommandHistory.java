package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;

public class ItemCommandHistory extends ItemCommandBase {

    public ItemCommandHistory(Item item, Command command) {
        super(item, command);
    }

    public ItemCommandHistory(ItemCommandEvent event) {
        super(event.getItem(), event.getCommand());
    }
}
