package com.incquerylabs.iot.eshieventbusservice;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;

public interface IEventBusService {
    public void postCommand(String itemName, Command command);

    public void postCommand(Item item, Command command);

    public void timedCommand(ITimedCommand timedCommand);

    public void stopTimedCommand(String itemName);

    public void stopTimedCommand(Item item);

    public void setSubscriber(IEventBusSubscriber eventSubscriber);

    public void unsetSubscriber(IEventBusSubscriber eventSubscriber);
}
