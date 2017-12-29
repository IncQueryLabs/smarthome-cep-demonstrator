package com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio;

import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.types.IncreaseDecreaseType;
import org.eclipse.smarthome.core.library.types.PercentType;

import com.incquerylabs.smarthome.eventbus.api.IEventPublisher;
import com.incquerylabs.smarthome.eventbus.api.IComplexCommand;

public class DimmerCommand implements IComplexCommand {

    private Item item;
    private int value;
    private long first;
    private long period;
    private Timer timer;

    public static DimmerCommand create(Item item, IncreaseDecreaseType type, int value, long first, long period) {
        return new DimmerCommand(item, type, value, first, period);
    }

    public static DimmerCommand create(Item item, IncreaseDecreaseType type, int value) {
        return new DimmerCommand(item, type, value, 50, 50);
    }

    public static DimmerCommand create(Item item, IncreaseDecreaseType type) {
        return new DimmerCommand(item, type, 2, 50, 50);
    }

    public DimmerCommand(Item item, IncreaseDecreaseType type, int value, long first, long period) {

        if (type != null && type == IncreaseDecreaseType.DECREASE) {
            if (value > 0) {
                value = value * (-1);
            }
        }

        this.item = item;
        this.value = value;
        this.first = first;
        this.period = period;
        this.timer = new Timer();
    }

    @Override
    public String getItemName() {
        return item.getName();
    }

    @Override
    public void start(final IEventPublisher eventBus) {
        timer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                int percent = ((PercentType) item.getState()).intValue();

                if ((percent == 100 && value > 0) || (percent == 0 && value < 0) || value == 0) {
                    return;
                }
                if (percent + value > 100) {
                    percent = 100;
                } else if (percent + value < 0) {
                    percent = 0;
                }
                eventBus.postCommand(item, new PercentType(percent + value));
            }
        }, first, period);

    }

    @Override
    public void stop() {
        timer.cancel();
    }
}
