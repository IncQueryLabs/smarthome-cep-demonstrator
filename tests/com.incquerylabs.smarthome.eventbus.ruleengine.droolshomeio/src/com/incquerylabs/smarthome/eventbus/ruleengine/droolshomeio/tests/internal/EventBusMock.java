package com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio.tests.internal;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.smarthome.core.items.GenericItem;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.smarthome.eventbus.api.IEventPublisher;
import com.incquerylabs.smarthome.eventbus.api.ITimedCommand;

public class EventBusMock implements IEventPublisher {
    static Logger logger = LoggerFactory.getLogger(EventBusMock.class);

    Map<Item, LinkedList<Command>> commands = new HashMap<Item, LinkedList<Command>>();
    Map<String, Item> items = new HashMap<String, Item>();

    private ConcurrentHashMap<String, ITimedCommand> timedCommands = new ConcurrentHashMap<String, ITimedCommand>();

    @Override
    public void postCommand(String itemName, Command command) {
        Item item = items.get(itemName);

        if (item == null) {
            logger.warn("Warning! Item: " + itemName + " not found!");
            return;
        }
        postCommand(item, command);
    }

    @Override
    public void postCommand(Item item, Command command) {
        if (commands.get(item) == null) {
            commands.put(item, new LinkedList<Command>());
        }
        commands.get(item).add(command);
        processCommand(item, command);
    }

    @Override
    public synchronized void timedCommand(ITimedCommand timedCommand) {
        String itemName = timedCommand.getItemName();
        stopTimedCommand(timedCommands.get(itemName));

        timedCommand.start(this);
        timedCommands.put(itemName, timedCommand);
    }

    private void stopTimedCommand(ITimedCommand timedCommand) {
        if (timedCommand != null) {
            timedCommand.stop();
            timedCommands.remove(timedCommand.getItemName());
        }
    }

    @Override
    public synchronized void stopTimedCommand(String itemName) {
        stopTimedCommand(timedCommands.get(itemName));
    }

    @Override
    public synchronized void stopTimedCommand(Item item) {
        stopTimedCommand(item.getName());
    }

    private void processCommand(Item item, Command command) {
        if (item instanceof GenericItem) {
            GenericItem genItem = (GenericItem) item;
            if (command instanceof State) {
                genItem.setState((State) command);
            } else {
                throw new IllegalStateException("Cannot parse command " + command + " to state");
            }
        } else {
            throw new IllegalStateException("Cannot parse command " + command + " to state");
        }
    }
}
