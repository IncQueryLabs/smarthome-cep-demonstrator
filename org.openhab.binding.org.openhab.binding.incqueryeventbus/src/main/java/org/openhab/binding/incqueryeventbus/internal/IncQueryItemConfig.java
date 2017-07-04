package org.openhab.binding.incqueryeventbus.internal;

import java.util.ArrayList;
import java.util.List;

import org.openhab.core.binding.BindingConfig;
import org.openhab.core.items.Item;
import org.openhab.model.item.binding.BindingConfigParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IncQueryItemConfig implements BindingConfig {

    private static final Logger logger = LoggerFactory.getLogger(IncQueryItemConfig.class);

    private List<MessagePublisher> publishConfigurations = new ArrayList<MessagePublisher>();

    private List<MessageSubscriber> subscribeConfigurations = new ArrayList<MessageSubscriber>();

    /**
     * Create new MQTT binding configuration for the given item.
     *
     * @param itemName
     *            item name.
     * @param bindingConfig
     *            configuration string
     * @throws BindingConfigParseException
     *             If the configuration string is invalid.
     */
    public IncQueryItemConfig(Item item, String bindingConfig) throws BindingConfigParseException {

    }

    /**
     * @return List of all defined publish configurations for the item.
     */
    public List<MessagePublisher> getMessagePublishers() {
        return publishConfigurations;
    }

    /**
     * @return List of all defined subscribe configurations for the item.
     */
    public List<MessageSubscriber> getMessageSubscribers() {
        return subscribeConfigurations;
    }

}
