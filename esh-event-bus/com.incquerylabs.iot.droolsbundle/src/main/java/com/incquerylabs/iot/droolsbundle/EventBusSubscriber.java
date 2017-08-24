package com.incquerylabs.iot.droolsbundle;

import java.io.File;
import java.io.FileInputStream;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.types.OnOffType;
import org.eclipse.smarthome.core.library.types.OpenClosedType;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.kie.api.builder.Results;
import org.kie.api.conf.EventProcessingOption;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.iot.eshieventbusservice.IEventBusService;
import com.incquerylabs.iot.eshieventbusservice.IEventBusSubscriber;

public class EventBusSubscriber implements IEventBusSubscriber {
    static Logger logger = LoggerFactory.getLogger(EventBusSubscriber.class);

    private Object lock = new Object();

    protected IEventBusService eventBusService;
    private KieSession kSession;

    public EventBusSubscriber(IEventBusService eventBusService) {

        logger.debug("IncQuery droolsbundle: constructor");
        logger.debug("IncQuery droolsbundle: location: " + new File("location.txt").getAbsolutePath());
        this.eventBusService = eventBusService;

        try {
            KieHelper kieHelper = new KieHelper();
            kieHelper.addResource(ResourceFactory.newInputStreamResource(new FileInputStream("rules\\Sample.drl")),
                    ResourceType.DRL);

            Results results = kieHelper.verify();
            if (results.hasMessages(org.kie.api.builder.Message.Level.ERROR)) {
                logger.debug("IncQuery droolsbundle: error with DRL file");
                logger.debug("" + results.getMessages());
                throw new IllegalStateException("### errors ###");
            }

            kSession = kieHelper.build(EventProcessingOption.STREAM).newKieSession();
            kSession.setGlobal("openhab", eventBusService);

            logger.debug("IncQuery droolsbundle: successfully loaded DRL file");
            logger.debug("IncQuery droolsbundle: kSession: " + kSession);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stateChanged(Item item, State newState, State oldState) {
        synchronized (lock) {
            logger.debug("IncQuery droolsbundle: " + item.getName() + " state changed to: " + newState);
            ItemStateChanged itemStateChanged = new ItemStateChanged(item, newState, oldState);
            FactHandle handle = kSession.insert(itemStateChanged);
            kSession.fireAllRules();
            kSession.delete(handle);
        }
    }

    @Override
    public void commandReceived(Item item, Command command) {
        synchronized (lock) {
            logger.debug("IncQuery droolsbundle: " + item.getName() + " received command: " + command);
            ItemReceivedCommand itemReceivedCommand = new ItemReceivedCommand(item, command);
            kSession.insert(itemReceivedCommand);
            kSession.fireAllRules();
        }
    }

    public static class ItemReceivedCommand {

        public static final Command ON = OnOffType.ON;
        public static final Command OFF = OnOffType.OFF;

        private Item item;
        private Command command;

        public ItemReceivedCommand(Item item, Command command) {
            this.item = item;
            this.command = command;
        }

        public Item getItem() {
            return item;
        }

        public String getItemName() {
            return this.item.getName();
        }

        public Command getCommand() {
            return this.command;
        }
    }

    public static class ItemStateChanged

    {

        public static final State OPEN = OpenClosedType.OPEN;
        public static final State CLOSED = OpenClosedType.CLOSED;

        private Item item;
        private State newState;
        private State oldState;

        public ItemStateChanged(Item item, State newState, State oldState) {
            this.item = item;
            this.newState = newState;
            this.oldState = oldState;
        }

        public Item getItem() {
            return item;
        }

        public String getItemName() {
            return this.item.getName();
        }

        public State getNewState() {
            return this.newState;
        }

        public State getOldState() {
            return this.oldState;
        }
    }

    @Override
    public void initItems(Collection<Item> items) {
        new ConcurrentHashMap<String, Item>();
    }

    @Override
    public void itemAdded(Item item) {
        // TODO Auto-generated method stub

    }

    @Override
    public void itemRemoved(String itemName) {
        // TODO Auto-generated method stub

    }

    @Override
    public void itemUpdated(Item newItem, String oldItemName) {
        // TODO Auto-generated method stub

    }
}
