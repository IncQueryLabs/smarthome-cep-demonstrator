package com.incquerylabs.iot.eshieventbusservice;

public interface ITimedCommand {

    public void start(IEventPublisher publisher);

    public void stop();

    public String getItemName();
}
