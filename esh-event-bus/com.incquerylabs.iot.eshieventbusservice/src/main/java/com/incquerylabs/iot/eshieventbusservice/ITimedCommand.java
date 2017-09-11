package com.incquerylabs.iot.eshieventbusservice;

public interface ITimedCommand {

    public void start(IEventBusService service);

    public void stop();

    public String getItemName();
}
