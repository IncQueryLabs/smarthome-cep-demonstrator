package com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio.tests;

import static org.junit.Assert.assertNotEquals;

import java.util.LinkedList;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.items.ContactItem;
import org.eclipse.smarthome.core.library.items.DimmerItem;
import org.eclipse.smarthome.core.library.types.OpenClosedType;
import org.eclipse.smarthome.core.library.types.PercentType;
import org.junit.Test;

import com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio.tests.internal.BaseTest;

public class ALightsSwitchTest extends BaseTest {

    private static final OpenClosedType OPEN = OpenClosedType.OPEN;
    private static final OpenClosedType CLOSED = OpenClosedType.CLOSED;
    private static final PercentType ZERO = PercentType.ZERO;
    private static final PercentType HUNDRED = PercentType.HUNDRED;

    DimmerItem A_Lights_Analog = new DimmerItem("A_Lights_Analog");

    ContactItem A_Light_Switch_Dimmer_1_Up = new ContactItem("A_Light_Switch_Dimmer_1_Up");
    ContactItem A_Light_Switch_Dimmer_2_Up = new ContactItem("A_Light_Switch_Dimmer_2_Up");
    ContactItem A_Light_Switch_Dimmer_3_Up = new ContactItem("A_Light_Switch_Dimmer_3_Up");

    ContactItem A_Light_Switch_Dimmer_1_Down = new ContactItem("A_Light_Switch_Dimmer_1_Down");
    ContactItem A_Light_Switch_Dimmer_2_Down = new ContactItem("A_Light_Switch_Dimmer_2_Down");
    ContactItem A_Light_Switch_Dimmer_3_Down = new ContactItem("A_Light_Switch_Dimmer_3_Down");

    @Override
    protected LinkedList<Item> getTestItems() {
        LinkedList<Item> items = new LinkedList<Item>();

        items.add(A_Lights_Analog);

        items.add(A_Light_Switch_Dimmer_1_Up);
        items.add(A_Light_Switch_Dimmer_2_Up);
        items.add(A_Light_Switch_Dimmer_3_Up);
        items.add(A_Light_Switch_Dimmer_1_Down);
        items.add(A_Light_Switch_Dimmer_2_Down);
        items.add(A_Light_Switch_Dimmer_3_Down);

        return items;
    }

    @Test
    public void testA_Lights() throws InterruptedException {
        // Light initialized to be off
        assertEquals(ZERO, A_Lights_Analog.getStateAs(PercentType.class));

        // Holding the Up for 0.9 seconds
        setState(A_Light_Switch_Dimmer_1_Up, OPEN);

        // Before releasing the switch, nothing happens
        Thread.sleep(900);
        assertEquals(ZERO, A_Lights_Analog.getStateAs(PercentType.class));

        // After releasing, it changes to 100
        setState(A_Light_Switch_Dimmer_1_Up, CLOSED);
        assertEquals(HUNDRED, A_Lights_Analog.getStateAs(PercentType.class));

        // Holding the Down for 0.9 seconds
        setState(A_Light_Switch_Dimmer_1_Down, OPEN);

        // Before releasing the switch, nothing happens
        Thread.sleep(900);
        assertEquals(HUNDRED, A_Lights_Analog.getStateAs(PercentType.class));

        // After releasing, it changes to 0
        setState(A_Light_Switch_Dimmer_1_Down, CLOSED);
        assertEquals(ZERO, A_Lights_Analog.getStateAs(PercentType.class));
    }

    @Test
    public void testA_Lights_Dimmer() throws InterruptedException {
        // Light initialized to be off
        assertEquals(ZERO, A_Lights_Analog.getStateAs(PercentType.class));

        // Holding the Up for 4 seconds
        setState(A_Light_Switch_Dimmer_1_Up, OPEN);

        // Until the first second, nothing happens
        Thread.sleep(900);
        assertEquals(ZERO, A_Lights_Analog.getStateAs(PercentType.class));

        // After the first second neither 100 nor 0
        Thread.sleep(100 + 500);
        assertNotEquals(HUNDRED, A_Lights_Analog.getStateAs(PercentType.class));
        assertNotEquals(ZERO, A_Lights_Analog.getStateAs(PercentType.class));

        // After 4 seconds, it reaches 100
        Thread.sleep(2500);
        assertEquals(HUNDRED, A_Lights_Analog.getStateAs(PercentType.class));

        // Release switch
        setState(A_Light_Switch_Dimmer_1_Up, CLOSED);
        assertEquals(HUNDRED, A_Lights_Analog.getStateAs(PercentType.class));

        // Holding the Down for 4 seconds
        setState(A_Light_Switch_Dimmer_1_Down, OPEN);

        // Until the first second, nothing happens
        Thread.sleep(900);
        assertEquals(HUNDRED, A_Lights_Analog.getStateAs(PercentType.class));

        // After the first second neither 100 nor 0
        Thread.sleep(100 + 500);
        assertNotEquals(HUNDRED, A_Lights_Analog.getStateAs(PercentType.class));
        assertNotEquals(ZERO, A_Lights_Analog.getStateAs(PercentType.class));

        // After 4 seconds, it reaches 0
        Thread.sleep(2500);
        assertEquals(ZERO, A_Lights_Analog.getStateAs(PercentType.class));

        // Release switch
        setState(A_Light_Switch_Dimmer_1_Down, CLOSED);
        assertEquals(ZERO, A_Lights_Analog.getStateAs(PercentType.class));
    }
}
