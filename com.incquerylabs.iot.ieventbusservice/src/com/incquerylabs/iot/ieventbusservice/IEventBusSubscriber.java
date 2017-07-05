package com.incquerylabs.iot.ieventbusservice;

public interface IEventBusSubscriber {

    public void stateChanged(String newState);

    public void commandReceived(String command);

    public String getItemName();
}
