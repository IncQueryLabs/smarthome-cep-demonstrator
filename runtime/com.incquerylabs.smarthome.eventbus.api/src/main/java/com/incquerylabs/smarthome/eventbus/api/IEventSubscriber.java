package com.incquerylabs.smarthome.eventbus.api;

import java.util.Collection;

import org.eclipse.smarthome.core.items.Item;

import com.incquerylabs.smarthome.eventbus.api.events.GroupItemStateChangedEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemAddedEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemCommandEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemRemovedEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemStateChangedEvent;
import com.incquerylabs.smarthome.eventbus.api.events.ItemUpdatedEvent;

public interface IEventSubscriber {
    public void stateChanged(ItemStateChangedEvent event);
    
    public void groupStateChanged(GroupItemStateChangedEvent event);

    public void commandReceived(ItemCommandEvent event);

    public void initItems(Collection<Item> items);

    public void itemAdded(ItemAddedEvent event);

    public void itemRemoved(ItemRemovedEvent event);

    public void itemUpdated(ItemUpdatedEvent event);

    public String getSubscriberName();
}
