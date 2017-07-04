package org.openhab.binding.incqueryeventbus.internal;

import java.util.Timer;
import java.util.TimerTask;

import org.openhab.core.binding.AbstractBinding;
import org.openhab.core.items.ItemNotFoundException;
import org.openhab.core.items.ItemRegistry;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IncQueryEventBusBinding extends AbstractBinding<EventBusBindingProvider> {

    private static final Logger logger = LoggerFactory.getLogger(IncQueryEventBusBinding.class);

    /** openHAB ItemRegistry for resolving item names to items **/
    private ItemRegistry itemRegistry;

    private MessagePublisher statePublisher;

    private MessagePublisher commandPublisher;

    private MessageSubscriber stateSubscriber;

    private MessageSubscriber commandSubscriber;

    // private static final String subscribeItemName = "dandridbinding_dandrid_38f61f87_pir_switch";
    private static final String subscribeItemName = "dandridbinding_dandrid_38f61f87_mqtt_switch";

    Timer timer = new Timer();

    @Override
    public void activate() {
        super.activate();
        logger.debug("IncQuery: Activating event bus binding.");

        statePublisher = new MessagePublisher(" state changed to: ");
        commandPublisher = new MessagePublisher(" received command: ");
        stateSubscriber = new MessageSubscriber();
        commandSubscriber = new MessageSubscriber();

        stateSubscriber.setEventPublisher(eventPublisher);
        commandSubscriber.setEventPublisher(eventPublisher);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    commandSubscriber.postCommand(itemRegistry.getItem(subscribeItemName), "ON");
                } catch (ItemNotFoundException e) {
                    logger.error("Item not found");
                }
            }
        }, 5 * 1000, 5 * 1000);
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