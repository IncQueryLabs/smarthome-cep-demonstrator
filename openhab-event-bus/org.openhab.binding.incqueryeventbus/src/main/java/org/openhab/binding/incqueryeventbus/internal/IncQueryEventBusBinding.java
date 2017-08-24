package org.openhab.binding.incqueryeventbus.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.openhab.core.binding.AbstractBinding;
import org.openhab.core.items.Item;
import org.openhab.core.items.ItemNotFoundException;
import org.openhab.core.items.ItemRegistry;
import org.openhab.core.types.Command;
import org.openhab.core.types.State;
import org.openhab.core.types.TypeParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.ieventbusservice.IEventBusService;
import com.incquerylabs.iot.ieventbusservice.IEventBusSubscriber;

public class IncQueryEventBusBinding extends AbstractBinding<EventBusBindingProvider> implements IEventBusService {

    private static final Logger logger = LoggerFactory.getLogger(IncQueryEventBusBinding.class);

    /** openHAB ItemRegistry for resolving item names to items **/
    private ItemRegistry itemRegistry;

    private ConcurrentHashMap<String, IEventBusSubscriber> eventSubscribers;

    // private static final String subscribeItemName = "dandridbinding_dandrid_38f61f87_pir_switch";
    // private static final String subscribeItemName = "dandridbinding_dandrid_38f61f87_mqtt_switch";

    @Override
    public void activate() {
        super.activate();
        logger.debug("IncQuery: Activating event bus binding.");

        eventSubscribers = new ConcurrentHashMap<String, IEventBusSubscriber>();
        /*
         * timer.scheduleAtFixedRate(new TimerTask() {
         *
         * @Override
         * public void run() {
         * try {
         * commandSubscriber.postCommand(itemRegistry.getItem(subscribeItemName), "ON");
         * } catch (ItemNotFoundException e) {
         * logger.error("Item not found");
         * }
         * }
         * }, 5 * 1000, 5 * 1000);
         */
    }

    @Override
    public void deactivate() {
        logger.debug("IncQuery: Deactivating event bus binding.");
    }

    @Override
    public void receiveUpdate(String itemName, State newState) {
        if (newState == null || eventSubscribers == null) {
            return;
        }

        IEventBusSubscriber eventSubscriber = eventSubscribers.get(itemName);
        if (eventSubscriber == null) {
            logger.trace("IncQuery: No event subscriber for item: ", itemName);
            return;
        }

        eventSubscriber.stateChanged(newState.toString());
        logger.trace("IncQuery: Received from OpenHAB: " + itemName + " state changed to " + newState);
    }

    @Override
    public void receiveCommand(String itemName, Command command) {
        if (command == null || eventSubscribers == null) {
            return;
        }

        IEventBusSubscriber eventSubscriber = eventSubscribers.get(itemName);
        if (eventSubscriber == null) {
            logger.trace("IncQuery: No event subscriber for item: ", itemName);
            return;
        }

        eventSubscriber.commandReceived(command.toString());

        logger.trace("IncQuery: Received from OpenHAB: " + itemName + " command: " + command);
    }

    @Override
    public void postCommand(String itemName, String command) throws ItemNotFoundException {
        if (itemName == null) {
            logger.error("IncQuery: Item is NULL");
            return;
        }

        Item item = itemRegistry.getItem(itemName);
        eventPublisher.postCommand(itemName, getCommand(command, item.getAcceptedCommandTypes()));

        logger.debug("IncQuery: Publishing to OpenHAB: " + itemName + " command: " + command);
    }

    @Override
    public void postState(String itemName, String state) throws ItemNotFoundException {
        if (itemName == null) {
            logger.error("IncQuery: Item is NULL");
            return;
        }

        Item item = itemRegistry.getItem(itemName);
        eventPublisher.postUpdate(item.getName(), getState(state, item.getAcceptedDataTypes()));

        logger.debug("IncQuery: Publishing to OpenHAB: " + item.getName() + " state: " + state);
    }

    @Override
    public void registerSubscriber(IEventBusSubscriber subscriber) {
        eventSubscribers.put(subscriber.getItemName(), subscriber);

        logger.debug("IncQuery: Registering event subscriber to: " + subscriber.getItemName());
    }

    @Override
    public void unregisterSubscriber(IEventBusSubscriber subscriber) {
        eventSubscribers.remove(subscriber.getItemName());

        logger.debug("IncQuery: Unregistering event subscriber to: " + subscriber.getItemName());
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