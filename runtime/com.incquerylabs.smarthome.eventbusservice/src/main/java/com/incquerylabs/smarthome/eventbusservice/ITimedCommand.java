package com.incquerylabs.smarthome.eventbusservice;

public interface ITimedCommand {

    public void start(IEventPublisher publisher);

    public void stop();

    public String getItemName();
}
