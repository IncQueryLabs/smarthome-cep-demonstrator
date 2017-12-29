package com.incquerylabs.smarthome.eventbus.api;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;

public interface IEventPublisher {
    public void postCommand(String itemName, Command command);

    public void postCommand(Item item, Command command);

    public void startComplexCommand(IComplexCommand complexCommand);

    public void stopComplexCommand(String itemName);

    public void stopComplexCommand(Item item);
}
