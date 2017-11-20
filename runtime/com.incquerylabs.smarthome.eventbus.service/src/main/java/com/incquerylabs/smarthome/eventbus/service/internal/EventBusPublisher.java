package com.incquerylabs.smarthome.eventbus.service.internal;

import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.events.ItemEventFactory;
import org.eclipse.smarthome.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.smarthome.eventbus.api.IEventPublisher;
import com.incquerylabs.smarthome.eventbus.api.IComplexCommand;

public class EventBusPublisher implements IEventPublisher {
    static Logger logger = LoggerFactory.getLogger(EventBusPublisher.class);

    private org.eclipse.smarthome.core.events.EventPublisher eventPublisher;
    private ConcurrentHashMap<String, IComplexCommand> complexCommands = new ConcurrentHashMap<String, IComplexCommand>();

    @Override
    public synchronized void postCommand(String itemName, Command command) {
        eventPublisher.post(ItemEventFactory.createCommandEvent(itemName, command));
        logger.debug(" posted command to item: " + itemName + " " + command);
    }

    @Override
    public synchronized void postCommand(Item item, Command command) {
        postCommand(item.getName(), command);

    }

    @Override
    public synchronized void startComplexCommand(IComplexCommand timedCommand) {
        String itemName = timedCommand.getItemName();
        stopComplexCommand(complexCommands.get(itemName));

        timedCommand.start(this);
        complexCommands.put(itemName, timedCommand);
    }

    @Override
    public synchronized void stopComplexCommand(String itemName) {
    	stopComplexCommand(complexCommands.get(itemName));
    }

    @Override
    public synchronized void stopComplexCommand(Item item) {
    	stopComplexCommand(item.getName());
    }

    private void stopComplexCommand(IComplexCommand timedCommand) {
        if (timedCommand != null) {
            timedCommand.stop();
            complexCommands.remove(timedCommand.getItemName());
        }
    }

    public void setEventPublisher(org.eclipse.smarthome.core.events.EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
        logger.info(" set event publisher");
    }

    public void unsetEventPublisher(org.eclipse.smarthome.core.events.EventPublisher eventPublisher) {
        this.eventPublisher = null;
        logger.info(" removed event publisher");
    }

}
