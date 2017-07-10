/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.dandridbinding.handler;

import static org.openhab.binding.dandridbinding.DandridBindingBindingConstants.*;

import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The {@link DandridBindingHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author dandrid - Initial contribution
 */
public class DandridBindingHandler extends BaseThingHandler {

    private final Logger logger = LoggerFactory.getLogger(DandridBindingHandler.class);

    public DandridBindingHandler(Thing thing) {
        super(thing);
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        if (channelUID.getId().equals(ALLOW_PIR_SWITCH)) {
            // TODO: handle command

            // Note: if communication with thing fails for some reason,
            // indicate that by setting the status with detail information
            // updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.COMMUNICATION_ERROR,
            // "Could not control device at IP address x.x.x.x");
        } else if (channelUID.getId().equals(PIR_SWITCH)) {
            if ((OnOffType) command == OnOffType.ON) {
                triggerChannel(getThing().getChannel(EVENT_CHANNEL_ID_MOTION).getUID(), EVENT_MOTION_START);
                triggerChannel(getThing().getChannel(EVENT_CHANNEL_ID_MOTION_START).getUID(), EVENT_MOTION_START);
            } else if ((OnOffType) command == OnOffType.OFF) {
                triggerChannel(getThing().getChannel(EVENT_CHANNEL_ID_MOTION).getUID(), EVENT_MOTION_STOP);
                triggerChannel(getThing().getChannel(EVENT_CHANNEL_ID_MOTION_STOP).getUID(), EVENT_MOTION_STOP);
            }
        } else if (channelUID.getId().equals(MQTT_SWITCH)) {

        } else if (channelUID.getId().equals(MOTION)) {

        }
    }

    @Override
    public void initialize() {
        // TODO: Initialize the thing. If done set status to ONLINE to indicate proper working.
        // Long running initialization should be done asynchronously in background.
        updateStatus(ThingStatus.ONLINE);

        // Note: When initialization can NOT be done set the status with more details for further
        // analysis. See also class ThingStatusDetail for all available status details.
        // Add a description to give user information to understand why thing does not work
        // as expected. E.g.
        // updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.CONFIGURATION_ERROR,
        // "Can not access device as username and/or password are invalid");
    }
}
