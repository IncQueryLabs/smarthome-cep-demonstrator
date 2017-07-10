/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.incqueryeventbus;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link IncQueryEventBusBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author dandrid - Initial contribution
 */
public class IncQueryEventBusBindingConstants {

    private static final String BINDING_ID = "incqueryeventbus";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_SAMPLE = new ThingTypeUID(BINDING_ID, "sample");

    // List of all Channel ids
    public static final String CHANNEL_1 = "channel1";

}
