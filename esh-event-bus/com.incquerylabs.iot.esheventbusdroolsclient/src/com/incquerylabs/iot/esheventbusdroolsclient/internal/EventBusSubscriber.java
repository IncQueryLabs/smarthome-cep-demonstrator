package com.incquerylabs.iot.esheventbusdroolsclient.internal;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.esheventbusdroolsclient.EventBusClient;
import com.incquerylabs.iot.eshieventbusservice.IEventBusService;
import com.incquerylabs.iot.eshieventbusservice.IEventBusSubscriber;

public class EventBusSubscriber implements IEventBusSubscriber {
    static Logger logger = LoggerFactory.getLogger(EventBusClient.class);

    private Object lock = new Object();

    protected IEventBusService eventBusService;
    private KieSession kSession;

    public EventBusSubscriber() {
        try {
            // load up the knowledge base
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            kSession = kContainer.newKieSession("ksession-rules");
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public EventBusSubscriber(IEventBusService eventBusService) {
        this.eventBusService = eventBusService;
    }

    @Override
    public void stateChanged(Item item, State newState, State olsState) {
        logger.debug("IncQuery: " + item.getName() + " state changed to: " + newState);
    }

    @Override
    public void commandReceived(Item item, Command command) {

        synchronized (lock) {
            ItemReceivedCommand itemReceivedCommand = new ItemReceivedCommand();
            itemReceivedCommand.setItemName(item.getName());
            itemReceivedCommand.setCommand(command);
            kSession.insert(itemReceivedCommand);
            kSession.fireAllRules();
            logger.debug("IncQuery: " + item.getName() + " received command: " + command);
        }
    }

    public static class ItemReceivedCommand {

        public static final Command ON = OnOffType.ON;
        public static final Command OFF = OnOffType.OFF;
        public static final String allowPirSwitch = "allowPirSwitch";
        public static final String mqttSwitch = "mqttSwitch";

        private String itemName;

        private Command command;

        public String getItemName() {
            return this.itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public Command getCommand() {
            return this.command;
        }

        public void setCommand(Command command) {
            this.command = command;
        }

    }
}
