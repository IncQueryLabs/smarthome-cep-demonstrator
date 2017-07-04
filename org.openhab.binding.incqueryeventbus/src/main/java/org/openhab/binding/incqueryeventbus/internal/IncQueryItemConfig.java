package org.openhab.binding.incqueryeventbus.internal;

import org.openhab.core.binding.BindingConfig;
import org.openhab.core.items.Item;
import org.openhab.model.item.binding.BindingConfigParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IncQueryItemConfig implements BindingConfig {

    private static final Logger logger = LoggerFactory.getLogger(IncQueryItemConfig.class);

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
}
