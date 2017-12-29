package com.incquerylabs.smarthome.eventbus.api;

public interface IComplexCommand {

    public void start(IEventPublisher publisher);

    public void stop();

    public String getItemName();
}
