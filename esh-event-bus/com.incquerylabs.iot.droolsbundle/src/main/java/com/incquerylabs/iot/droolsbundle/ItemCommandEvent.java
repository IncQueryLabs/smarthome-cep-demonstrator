package com.incquerylabs.iot.droolsbundle;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;

public class ItemCommandEvent {

    private Item item;
    private Command command;
    private boolean processed = false;

    public ItemCommandEvent(Item item, Command command) {
        this.item = item;
        this.command = command;
    }

    public Item getItem() {
        return item;
    }

    public String getName() {
        return this.item.getName();
    }

    public Command getCommand() {
        return this.command;
    }

    public boolean getProcessed() {
        return processed;
    }

    public void setProcessed() {
        processed = true;
    }

    @Override
    public String toString() {
        return "Item '" + item.getName() + "' received command " + command;
    }
}
