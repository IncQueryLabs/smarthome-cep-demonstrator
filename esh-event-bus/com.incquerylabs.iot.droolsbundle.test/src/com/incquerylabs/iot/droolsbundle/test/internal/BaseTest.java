package com.incquerylabs.iot.droolsbundle.test.internal;

import java.util.LinkedList;

import org.eclipse.smarthome.core.items.GenericItem;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;
import org.junit.Before;

import com.incquerylabs.iot.droolsbundle.EventBusSubscriber;
import com.incquerylabs.iot.eshieventbusservice.IEventBusSubscriber;

import junit.framework.TestCase;

public abstract class BaseTest extends TestCase {
    protected EventBusMock eventBus;
    protected IEventBusSubscriber drools;

    protected void setState(GenericItem item, State state) {
        State oldState = item.getState();
        item.setState(state);
        drools.stateChanged(item, state, oldState);
    }

    protected abstract LinkedList<Item> getTestItems();

    @Override
    @Before
    public void setUp() {
        eventBus = new EventBusMock();
        drools = new EventBusSubscriber(eventBus);

        LinkedList<Item> tesetItems = getTestItems();

        for (Item item : tesetItems) {
            eventBus.items.put(item.getName(), item);
        }

        for (Item item : tesetItems) {
            drools.itemAdded(item);
        }
    }

}
