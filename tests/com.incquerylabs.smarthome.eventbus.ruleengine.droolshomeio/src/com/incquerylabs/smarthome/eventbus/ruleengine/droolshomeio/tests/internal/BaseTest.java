package com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio.tests.internal;

import java.util.LinkedList;

import org.eclipse.smarthome.core.items.GenericItem;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.State;
import org.junit.Before;

import com.incquerylabs.smarthome.demorules.homeio.RuleLoader;
import com.incquerylabs.smarthome.eventbus.api.events.ItemStateChangedEvent;
import com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio.DroolsEventBusClient;

import junit.framework.TestCase;

public abstract class BaseTest extends TestCase {
    protected EventBusMock eventBus;
    protected DroolsEventBusClient drools;

    protected void setState(GenericItem item, State newState) {
        State oldState = item.getState();
        item.setState(newState);
        drools.stateChanged(new ItemStateChangedEvent(item, newState, oldState));
    }

    protected abstract LinkedList<Item> getTestItems();

    @Override
    @Before
    public void setUp() {
        eventBus = new EventBusMock();
        drools = new DroolsEventBusClient();
        drools.setEventPublisher(eventBus);
        drools.setRuleLoader(new RuleLoader());

        LinkedList<Item> tesetItems = getTestItems();

        for (Item item : tesetItems) {
            eventBus.items.put(item.getName(), item);
        }

        for (Item item : tesetItems) {
            drools.itemAdded(item);
        }
    }
}
