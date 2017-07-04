package org.openhab.binding.incqueryeventbus.internal;

import org.openhab.core.binding.BindingProvider;

public interface IncQueryBindingProvider extends BindingProvider {

    /**
     * Retrieve MQTT configuration for the item with the given ItemName.
     *
     * @param itemName
     *            name of the item for which to retrieve the config.
     * @return item config.
     */
    public IncQueryItemConfig getItemConfig(String itemName);

}