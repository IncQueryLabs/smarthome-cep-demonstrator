package com.incquerylabs.iot.droolsbundle;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;

public class ItemStateChangedEvent {

    private Item item;
    private State newState;
    private State oldState;
    private boolean processed = false;

    public ItemStateChangedEvent(Item item, State newState, State oldState) {
        this.item = item;
        this.newState = newState;
        this.oldState = oldState;
    }

    public Item getItem() {
        return item;
    }

    public String getName() {
        return this.item.getName();
    }

    public State getNewState() {
        return this.newState;
    }

    public State getOldState() {
        return this.oldState;
    }

    public boolean getProcessed() {
        return processed;
    }

    public void setProcessed() {
        processed = true;
    }

    @Override
    public String toString() {
        return String.format("%s changed from %s to %s", item.getName(), oldState, newState);
    }
}
