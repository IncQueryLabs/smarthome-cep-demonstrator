package com.incquerylabs.smarthome.eventbusservice;

import java.util.Collection;

import org.eclipse.smarthome.core.items.Item;

import com.incquerylabs.smarthome.eventbusservice.events.ItemCommandEvent;
import com.incquerylabs.smarthome.eventbusservice.events.ItemStateChangedEvent;

public interface IEventSubscriber {
    public void stateChanged(ItemStateChangedEvent event);

    public void commandReceived(ItemCommandEvent event);

    public void initItems(Collection<Item> items);

    public void itemAdded(Item item);

    public void itemRemoved(String itemName);

    public void itemUpdated(Item newItem, String oldItemName);

    public String getSubscriberName();
}
