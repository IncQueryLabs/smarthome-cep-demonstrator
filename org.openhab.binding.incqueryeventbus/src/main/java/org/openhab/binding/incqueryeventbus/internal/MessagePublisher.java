/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.incqueryeventbus.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Message publisher configuration for items which send outbound MQTT messages.
 *
 * @author Davy Vanherbergen
 * @since 1.3.0
 */
public class MessagePublisher {

    private static final Logger logger = LoggerFactory.getLogger(MessagePublisher.class);

    private String logString;

    /**
     *
     * @param logString
     *            the String to include in the log between ItemName and state/command.
     */
    public MessagePublisher(String logString) {
        this.logString = logString;
    }

    /**
     * Publish a messge.
     *
     * @param message
     */
    public void publish(String itemName, String message) {
        logger.info("Received from OpenHAB: " + itemName + logString + message);
    }

    /**
     * @return true if this publisher has been activated by the
     *         MqttBrokerConnection.
     */
    public boolean isActivated() {
        // TODO
        return true;
    }
}
