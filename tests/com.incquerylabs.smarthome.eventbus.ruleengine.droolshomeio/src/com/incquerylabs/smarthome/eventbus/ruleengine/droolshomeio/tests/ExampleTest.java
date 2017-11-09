package com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio.tests;

import java.util.LinkedList;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.items.ContactItem;
import org.eclipse.smarthome.core.library.items.SwitchItem;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.library.types.OpenClosedType;
import org.junit.Test;

import com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio.tests.internal.BaseTest;

public class ExampleTest extends BaseTest {

    private static final OnOffType ON = OnOffType.ON;
    private static final OnOffType OFF = OnOffType.OFF;
    private static final OpenClosedType OPEN = OpenClosedType.OPEN;
    private static final OpenClosedType CLOSED = OpenClosedType.CLOSED;

    SwitchItem Example_Light = new SwitchItem("Example_Light");
    ContactItem Example_Switch = new ContactItem("Example_Switch");

    @Override
    protected LinkedList<Item> getTestItems() {
        LinkedList<Item> items = new LinkedList<Item>();

        items.add(Example_Light);
        items.add(Example_Switch);

        return items;
    }

    @Test
    public void testExampleLightChangeSwitch() {
        // Pressing the switch changes the light state from OFF to ON
        setState(Example_Switch, OPEN);
        assertEquals(ON, Example_Light.getState());

        // Releasing the switch has no effect
        setState(Example_Switch, CLOSED);
        assertEquals(ON, Example_Light.getState());

        // Pressing the switch changes the light state from ON to OFF
        setState(Example_Switch, OPEN);
        assertEquals(OFF, Example_Light.getState());

        // Releasing the switch has no effect
        setState(Example_Switch, CLOSED);
        assertEquals(OFF, Example_Light.getState());
    }
}
