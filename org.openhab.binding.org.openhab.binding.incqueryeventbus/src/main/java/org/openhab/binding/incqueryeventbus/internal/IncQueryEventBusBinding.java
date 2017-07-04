package org.openhab.binding.incqueryeventbus.internal;

import org.openhab.core.binding.AbstractBinding;
import org.openhab.core.items.Item;
import org.openhab.core.items.ItemNotFoundException;
import org.openhab.core.items.ItemRegistry;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IncQueryEventBusBinding extends AbstractBinding<IncQueryBindingProvider> {

    private static final Logger logger = LoggerFactory.getLogger(IncQueryEventBusBinding.class);

    /** openHAB ItemRegistry for resolving item names to items **/
    private ItemRegistry itemRegistry;

    private MessagePublisher statePublisher;

    private MessagePublisher commandPublisher;

    private MessageSubscriber stateSubscriber;

    private MessageSubscriber commandSubscriber;

    private static final String subscribeItemName = "mqttPir";

    @Override
    public void activate() {
        super.activate();
        logger.debug("IncQuery: Activating event bus binding.");

        statePublisher = new MessagePublisher(" state changed to: ");
        commandPublisher = new MessagePublisher(" received command: ");

        try {
            Item item = itemRegistry.getItem(subscribeItemName);
            stateSubscriber = new MessageSubscriber(item);
            commandSubscriber = new MessageSubscriber(item);
        } catch (ItemNotFoundException e) {
            logger.debug("Unable to find item {} for update; dropping", subscribeItemName);
            return;
        } catch (Exception e) {
            logger.error("Error parsing state from message.", e);
            return;
        }

    }

    @Override
    public void deactivate() {
        logger.debug("IncQuery: Deactivating event bus binding.");
    }

    @Override
    public void receiveUpdate(String itemName, State newState) {
        if (newState == null || statePublisher == null) {
            return;
        }
        statePublisher.publish(itemName, newState.toString());
    }

    @Override
    public void receiveCommand(String itemName, Command command) {
        if (commandPublisher == null || command == null) {
            return;
        }
        commandPublisher.publish(itemName, command.toString());
    }

    /**
     * Setter for the openHAB ItemRegistry.
     *
     * @param itemRegistry
     *            the openHAB item registry.
     */
    public void setItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = itemRegistry;
    }

    /**
     * Unsetter for the openHAB ItemRegistry.
     *
     * @param itemRegistry
     *            itemRegistry to remove.
     */
    public void unsetItemRegistry(ItemRegistry itemRegistry) {
        this.itemRegistry = null;
    }
}