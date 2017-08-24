/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.dandridbinding;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link DandridBindingBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author dandrid - Initial contribution
 */
public class DandridBindingBindingConstants {

    private static final String BINDING_ID = "dandridbinding";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_DANDRID = new ThingTypeUID(BINDING_ID, "dandrid");

    // List of all Channel ids
    public static final String ALLOW_PIR_SWITCH = "allow-pir-switch";
    public static final String PIR_SWITCH = "pir-switch";
    public static final String MQTT_SWITCH = "mqtt-switch";
    public static final String MOTION = "motionEvent";

    // commnads
    public static final String COMMAND_ON = "ON";
    public static final String COMMAND_OFF = "OFF";

    // events
    public static final String EVENT_MOTION_START = "START";
    public static final String EVENT_MOTION_STOP = "STOP";
    public static final String EVENT_CHANNEL_ID_MOTION = "motion";
    public static final String EVENT_CHANNEL_ID_MOTION_START = "motion-start";
    public static final String EVENT_CHANNEL_ID_MOTION_STOP = "motion-stop";
}
