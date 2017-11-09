package com.incquerylabs.smarthome.eventbus.service.internal;

import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.events.ItemEventFactory;
import org.eclipse.smarthome.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.smarthome.eventbus.api.IEventPublisher;
import com.incquerylabs.smarthome.eventbus.api.ITimedCommand;

public class EventBusPublisher implements IEventPublisher {
    static Logger logger = LoggerFactory.getLogger(EventBusPublisher.class);

    private org.eclipse.smarthome.core.events.EventPublisher eventPublisher;
    private ConcurrentHashMap<String, ITimedCommand> timedCommands = new ConcurrentHashMap<String, ITimedCommand>();

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
    public synchronized void timedCommand(ITimedCommand timedCommand) {
        String itemName = timedCommand.getItemName();
        stopTimedCommand(timedCommands.get(itemName));

        timedCommand.start(this);
        timedCommands.put(itemName, timedCommand);
    }

    @Override
    public synchronized void stopTimedCommand(String itemName) {
        stopTimedCommand(timedCommands.get(itemName));
    }

    @Override
    public synchronized void stopTimedCommand(Item item) {
        stopTimedCommand(item.getName());
    }

    private void stopTimedCommand(ITimedCommand timedCommand) {
        if (timedCommand != null) {
            timedCommand.stop();
            timedCommands.remove(timedCommand.getItemName());
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
