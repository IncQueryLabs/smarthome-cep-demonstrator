package org.openhab.binding.incqueryeventbus.internal;

import java.util.Collection;

import org.openhab.core.binding.BindingChangeListener;
import org.openhab.core.binding.BindingProvider;

public class EventBusBindingProvider implements BindingProvider {

    /**
     * Adds a binding change listener, which gets notified whenever there
     * are changes in the binding configuration
     *
     * @param listener the binding change listener to add
     */
    @Override
    public void addBindingChangeListener(BindingChangeListener listener) {

    }

    /**
     * Removes a binding change listener again.
     * Does nothing, if this listener has not been added before.
     *
     * @param listener the binding listener to remove
     */
    @Override
    public void removeBindingChangeListener(BindingChangeListener listener) {

    }

    /**
     * Indicates whether this binding provider contains a binding for the given
     * <code>itemName</code>
     *
     * @param itemName the itemName to check
     *
     * @return <code>true</code> if this provider contains an adequate mapping
     *         for <code>itemName</code> and <code>false</code> otherwise.
     */
    @Override
    public boolean providesBindingFor(String itemName) {
        return true;
    }

    /**
     * Indicates whether this binding provider contains any binding
     *
     * @return <code>true</code> if this provider contains any binding
     *         configuration and <code>false</code> otherwise
     */
    @Override
    public boolean providesBinding() {
        // TODO
        return true;
    }

    /**
     * Returns all items which are mapped to this binding
     *
     * @return items which are mapped to this binding
     */
    @Override
    public Collection<String> getItemNames() {
        // TODO
        return null;
    }

}