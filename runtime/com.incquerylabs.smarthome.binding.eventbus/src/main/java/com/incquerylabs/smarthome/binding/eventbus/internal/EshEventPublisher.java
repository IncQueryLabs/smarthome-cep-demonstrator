package com.incquerylabs.smarthome.binding.eventbus.internal;

import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.smarthome.core.events.EventPublisher;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.events.ItemEventFactory;
import org.eclipse.smarthome.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.smarthome.eventbusservice.IEventPublisher;
import com.incquerylabs.smarthome.eventbusservice.ITimedCommand;

public class EshEventPublisher implements IEventPublisher {
    static Logger logger = LoggerFactory.getLogger(EshEventPublisher.class);

    private EventPublisher eventPublisher;
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

    public void setEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
        logger.info(" set event publisher");
    }

    public void unsetEventPublisher(EventPublisher eventPublisher) {
        this.eventPublisher = null;
        logger.info(" removed event publisher");
    }

}
