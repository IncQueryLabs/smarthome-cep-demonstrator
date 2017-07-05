package com.incquerylabs.iot.ieventbusservice;

import org.openhab.core.items.ItemNotFoundException;

public interface IEventBusService {

    public void postCommand(String itemName, String command) throws ItemNotFoundException;

    public void postState(String itemName, String state) throws ItemNotFoundException;

    public void registerSubscriber(IEventBusSubscriber subscriber);

    public void unregisterSubscriber(IEventBusSubscriber subscriber);
}
