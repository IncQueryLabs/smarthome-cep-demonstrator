package com.incquerylabs.smarthome.eventbus.service.internal;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.smarthome.core.events.Event;
import org.eclipse.smarthome.core.events.EventFilter;
import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.items.ItemNotFoundException;
import org.eclipse.smarthome.core.items.ItemRegistry;
import org.eclipse.smarthome.core.items.events.GroupItemStateChangedEvent;
import org.eclipse.smarthome.core.items.events.ItemAddedEvent;
import org.eclipse.smarthome.core.items.events.ItemCommandEvent;
import org.eclipse.smarthome.core.items.events.ItemRemovedEvent;
import org.eclipse.smarthome.core.items.events.ItemStateChangedEvent;
import org.eclipse.smarthome.core.items.events.ItemStateEvent;
import org.eclipse.smarthome.core.items.events.ItemUpdatedEvent;
import org.eclipse.smarthome.core.types.Command;
import org.eclipse.smarthome.core.types.State;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incquerylabs.smarthome.eventbus.api.IEventSubscriber;

public class EventBusImpl implements org.eclipse.smarthome.core.events.EventSubscriber {
	private class EventSubscriberStruct {
		IEventSubscriber eventSubscriber;
		boolean itemsInitialized;

		public EventSubscriberStruct(IEventSubscriber eventSubscriber, boolean itemsInitialized) {
			this.eventSubscriber = eventSubscriber;
			this.itemsInitialized = itemsInitialized;
		}

		@Override
		public boolean equals(Object obj) {
			return eventSubscriber == obj;
		}
	}

	static Logger logger = LoggerFactory.getLogger(EventBusImpl.class);

	private ItemRegistry itemRegistry;
	private LinkedList<EventSubscriberStruct> eventSubscribers = new LinkedList<EventSubscriberStruct>();

	@Override
	public Set<String> getSubscribedEventTypes() {
		Set<String> types = new HashSet<>(6);

		types.add(ItemStateEvent.TYPE);
		types.add(ItemStateChangedEvent.TYPE);
		types.add(GroupItemStateChangedEvent.TYPE);
		types.add(ItemCommandEvent.TYPE);
		types.add(ItemAddedEvent.TYPE);
		types.add(ItemRemovedEvent.TYPE);
		types.add(ItemUpdatedEvent.TYPE);
		return types;
	}

	@Override
	public EventFilter getEventFilter() {
		return null;
	}

	@Override
	public void receive(Event event) {
		synchronized (eventSubscribers) {
			try {
				if (event instanceof ItemStateEvent) {

					itemStateEvent((ItemStateEvent) event);

				} else if (event instanceof ItemStateChangedEvent) {

					itemStateChangedEvent((ItemStateChangedEvent) event);

				} else if (event instanceof GroupItemStateChangedEvent) {

					groupItemStateChangedEvent((GroupItemStateChangedEvent) event);

				} else if (event instanceof ItemCommandEvent) {

					itemCommandEvent((ItemCommandEvent) event);

				} else if (event instanceof ItemAddedEvent) {

					itemAddedEvent((ItemAddedEvent) event);

				} else if (event instanceof ItemRemovedEvent) {

					itemRemovedEvent((ItemRemovedEvent) event);

				} else if (event instanceof ItemUpdatedEvent) {

					itemUpdatedEvent((ItemUpdatedEvent) event);

				} else {

					logger.trace(" received event, type: " + event.getType() + " topic: " + event.getTopic()
							+ " payload: " + event.getPayload());
				}
			} catch (ItemNotFoundException e) {
				logger.error(e.getMessage());
			}
		}
	}

	private void itemStateEvent(ItemStateEvent event) throws ItemNotFoundException {

		String itemName = event.getItemName();
		State itemState = event.getItemState();

		Item item = itemRegistry.getItem(itemName);

		for (EventSubscriberStruct subscriberStruct : eventSubscribers) {
			subscriberStruct.eventSubscriber
					.stateUpdated(new com.incquerylabs.smarthome.eventbus.api.events.ItemStateEvent(item, itemState));
		}
		logger.debug(event.toString());
	}

	private void itemStateChangedEvent(ItemStateChangedEvent event) throws ItemNotFoundException {

		String itemName = event.getItemName();
		State newState = event.getItemState();
		State oldState = event.getOldItemState();

		Item item = itemRegistry.getItem(itemName);

		for (EventSubscriberStruct subscriberStruct : eventSubscribers) {
			subscriberStruct.eventSubscriber.stateChanged(
					new com.incquerylabs.smarthome.eventbus.api.events.ItemStateChangedEvent(item, newState, oldState));
		}
		logger.debug(event.toString());
	}

	private void groupItemStateChangedEvent(GroupItemStateChangedEvent event) throws ItemNotFoundException {

		String itemName = event.getItemName();
		State newState = event.getItemState();
		State oldState = event.getOldItemState();

		Item item = itemRegistry.getItem(itemName);

		for (EventSubscriberStruct subscriberStruct : eventSubscribers) {
			subscriberStruct.eventSubscriber.groupStateChanged(
					new com.incquerylabs.smarthome.eventbus.api.events.GroupItemStateChangedEvent(item, newState,
							oldState));
		}
		logger.debug(event.toString());
	}

	private void itemCommandEvent(ItemCommandEvent event) throws ItemNotFoundException {
		String itemName = event.getItemName();
		Command command = event.getItemCommand();

		Item item = itemRegistry.getItem(itemName);
		for (EventSubscriberStruct subscriberStruct : eventSubscribers) {
			subscriberStruct.eventSubscriber.commandReceived(
					new com.incquerylabs.smarthome.eventbus.api.events.ItemCommandEvent(item, command));
		}
	}

	private void itemAddedEvent(ItemAddedEvent event) throws ItemNotFoundException {
		String itemName = event.getItem().name;
		Item item = itemRegistry.getItem(itemName);

		for (EventSubscriberStruct subscriberStruct : eventSubscribers) {
			subscriberStruct.eventSubscriber
					.itemAdded(new com.incquerylabs.smarthome.eventbus.api.events.ItemAddedEvent(item));
		}
		logger.debug(event.toString());
	}

	private void itemRemovedEvent(ItemRemovedEvent event) {
		String itemName = event.getItem().name;

		for (EventSubscriberStruct subscriberStruct : eventSubscribers) {
			subscriberStruct.eventSubscriber
					.itemRemoved(new com.incquerylabs.smarthome.eventbus.api.events.ItemRemovedEvent(itemName));
		}
		logger.debug(event.toString());
	}

	private void itemUpdatedEvent(ItemUpdatedEvent event) throws ItemNotFoundException {
		String itemName = event.getItem().name;
		String oldItemName = event.getOldItem().name;

		Item item = itemRegistry.getItem(itemName);

		for (EventSubscriberStruct subscriberStruct : eventSubscribers) {
			subscriberStruct.eventSubscriber.itemUpdated(
					new com.incquerylabs.smarthome.eventbus.api.events.ItemUpdatedEvent(item, oldItemName));
		}
		logger.debug(event.toString());
	}

	@SuppressWarnings("unlikely-arg-type")
	public void setSubscriber(IEventSubscriber eventSubscriber) {
		synchronized (eventSubscribers) {
			if (!eventSubscribers.contains(eventSubscriber)) {
				boolean itemsInitialized = false;
				if (itemRegistry != null) {
					eventSubscriber.initItems(itemRegistry.getItems());
					itemsInitialized = true;
				}
				eventSubscribers.add(new EventSubscriberStruct(eventSubscriber, itemsInitialized));
				logger.info("set event subscriber " + eventSubscriber.getSubscriberName());
			}
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	public void unsetSubscriber(IEventSubscriber eventSubscriber) {
		synchronized (eventSubscribers) {
			if (eventSubscribers.remove(eventSubscriber)) {
				logger.info("removed event subscriber " + eventSubscriber.getSubscriberName());
			}
		}
	}

	public void setItemRegistry(ItemRegistry itemRegistry) {
		this.itemRegistry = itemRegistry;
		if (!eventSubscribers.isEmpty()) {
			for (EventSubscriberStruct subscriberStruct : eventSubscribers) {
				if (!subscriberStruct.itemsInitialized) {
					subscriberStruct.eventSubscriber.initItems(itemRegistry.getItems());
				}
			}
		}
		logger.info("set item registry");
	}

	public void unsetItemRegistry(ItemRegistry itemRegistry) {
		this.itemRegistry = null;
		logger.info("unset item registry");
	}
}
