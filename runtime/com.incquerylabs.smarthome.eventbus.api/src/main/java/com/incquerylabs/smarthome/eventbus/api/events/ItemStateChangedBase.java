package com.incquerylabs.smarthome.eventbus.api.events;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;

public abstract class ItemStateChangedBase {
    protected final Item item;
    protected final State newState;
    protected final State oldState;

    public ItemStateChangedBase(Item item, State newState, State oldState) {
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

    @Override
    public String toString() {
        return String.format("%s changed from %s to %s", item.getName(), oldState, newState);
    }
}
