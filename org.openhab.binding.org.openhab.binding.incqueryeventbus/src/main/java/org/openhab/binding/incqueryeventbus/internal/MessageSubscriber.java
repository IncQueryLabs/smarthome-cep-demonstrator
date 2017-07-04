/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.incqueryeventbus.internal;

import java.util.ArrayList;
import java.util.List;

import org.openhab.core.events.EventPublisher;
import org.openhab.core.items.Item;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.openhab.core.types.TypeParser;
import org.openhab.model.item.binding.BindingConfigParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Message subscriber configuration for items which receive inbound MQTT
 * messages.
 *
 * @author Davy Vanherbergen
 * @since 1.3.0
 */
public class MessageSubscriber extends AbstractMessagePubSub {

    private static Logger logger = LoggerFactory.getLogger(MessageSubscriber.class);

    private EventPublisher eventPublisher;

    private List<Class<? extends State>> acceptedDataTypes = null;
    private List<Class<? extends Command>> acceptedCommandTypes = null;

    public MessageSubscriber() {

    }

    /**
     * Create new MessageSubscriber from config string and specific item we will be updating.
     *
     * @param configuration
     *            config string
     * @param item
     *            the item to which we will later post updates and send commands
     * @throws BindingConfigParseException
     *             if the config string is invalid
     */
    public MessageSubscriber(Item item) {

        if (item != null) {
            // copy the accepted data types and commands from the specific item we will be updating
            this.acceptedDataTypes = new ArrayList<Class<? extends State>>(item.getAcceptedDataTypes());
            this.acceptedCommandTypes = new ArrayList<Class<? extends Command>>(item.getAcceptedCommandTypes());
        }
    }

    public void processMessage(String message) {

        if (getMessageType().equals(MessageType.COMMAND)) {
            Command command = getCommand(message, this.acceptedCommandTypes);
            eventPublisher.postCommand(getItemName(), command);
            logger.info("Publishing to OpenHAB: " + getItemName() + " command: " + message);
        } else {
            State state = getState(message, this.acceptedDataTypes);
            eventPublisher.postUpdate(getItemName(), state);
            logger.info("Publishing to OpenHAB: " + getItemName() + " state: " + message);
        }

    }

    /**
     * Set the publisher to use for publishing openHAB updates.
     *
     * @param eventPublisher
     *            EventPublisher
     */
    public void setEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    /**
     * Convert a string representation of a state to an openHAB State.
     *
     * @param value
     *            string representation of State
     * @param acceptedDataTypes
     *            list of accepted data types for converting value
     * @return State
     */
    protected State getState(String value, List<Class<? extends State>> acceptedDataTypes) {

        return TypeParser.parseState(acceptedDataTypes, value);
    }

    /**
     * Convert a string representation of a command to an openHAB command.
     *
     * @param value
     *            string representation of command
     * @param acceptedCommands
     *            list of accepted commands for converting value
     * @return Command
     */
    protected Command getCommand(String value, List<Class<? extends Command>> acceptedCommands) {

        return TypeParser.parseCommand(acceptedCommands, value);
    }
}
