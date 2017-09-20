package com.incquerylabs.smarthome.eventbusservice;

import java.util.Collection;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;

public interface IEventSubscriber {
    public void stateChanged(Item item, State newState, State oldState);

    public void commandReceived(Item item, Command command);

    public void initItems(Collection<Item> items);

    public void itemAdded(Item item);

    public void itemRemoved(String itemName);

    public void itemUpdated(Item newItem, String oldItemName);

    public String getSubscriberName();
}
