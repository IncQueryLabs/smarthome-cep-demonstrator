package com.incquerylabs.iot.eshieventbusservice;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;

public interface IEventBusSubscriber {

    public void stateChanged(Item item, State newState, State oldState);

    public void commandReceived(Item item, Command command);
}
