/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.incqueryeventbus.internal;

import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Message publisher configuration for items which send outbound MQTT messages.
 *
 * @author Davy Vanherbergen
 * @since 1.3.0
 */
public class MessagePublisher extends AbstractMessagePubSub {

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
     * Check if this configuration supports processing of the given State.
     *
     * @param state
     *            for which to check if we can process.
     * @return true if processing is supported.
     */
    public boolean supportsState(State state) {
        if (getMessageType().equals(MessageType.STATE)) {
            return true;
        }
        return false;
    }

    /**
     * Check if this configuration supports processing of the given Command.
     *
     * @param command
     *            for which to check if we can process.
     * @return true if processing is supported.
     */
    public boolean supportsCommand(Command command) {
        if (getMessageType().equals(MessageType.COMMAND)) {
            return true;
        }
        return false;
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
