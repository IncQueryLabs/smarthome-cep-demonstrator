/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.incqueryeventbus.internal;

import org.openhab.core.binding.BindingConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for in and outbound MQTT message configurations on an openHAB
 * item.
 *
 * @author Davy Vanherbergen
 * @since 1.3.0
 */
public abstract class AbstractMessagePubSub implements BindingConfig {

    private static final Logger logger = LoggerFactory.getLogger(AbstractMessagePubSub.class);

    public enum MessageType {
        COMMAND,
        STATE
    }

    private MessageType messageType;

    private String itemName;

    /**
     * @return type of messages supported.
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * Set the supported message type.
     *
     * @param messageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    /**
     * @return item name for which this publisher/subscriber is used.
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName
     *            item name for which this publisher/subscriber is used.
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
