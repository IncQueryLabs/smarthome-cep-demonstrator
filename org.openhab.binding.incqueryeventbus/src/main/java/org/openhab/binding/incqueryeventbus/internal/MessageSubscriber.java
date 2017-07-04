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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageSubscriber {

    private static Logger logger = LoggerFactory.getLogger(MessageSubscriber.class);

    private EventPublisher eventPublisher;

    public void postCommand(Item item, String message) {

        if (item == null) {
            logger.error("Item is NULL");
            return;
        }

        Command command = getCommand(message, new ArrayList<Class<? extends Command>>(item.getAcceptedCommandTypes()));
        eventPublisher.postCommand(item.getName(), command);
        logger.info("Publishing to OpenHAB: " + item.getName() + " command: " + message);
    }

    public void postState(Item item, String message) {

        if (item == null) {
            logger.error("Item is NULL");
            return;
        }

        State state = getState(message, new ArrayList<Class<? extends State>>(item.getAcceptedDataTypes()));
        eventPublisher.postUpdate(item.getName(), state);
        logger.info("Publishing to OpenHAB: " + item.getName() + " state: " + message);
    }

    /**
     * Set the publisher to use for publishing openHAB updates.
     *
     * @param eventPublisher
     *            EventPublisher
     */
    public void setEventPublisher(EventPublisher eventPublisher) {
        if (eventPublisher == null) {
            logger.error("EventPublisher is cannot be null");
            return;
        }
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
