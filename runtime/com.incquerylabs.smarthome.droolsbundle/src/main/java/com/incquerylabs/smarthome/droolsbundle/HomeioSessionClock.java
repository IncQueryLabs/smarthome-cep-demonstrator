package com.incquerylabs.smarthome.droolsbundle;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.kie.api.time.SessionPseudoClock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeioSessionClock {
    static Logger logger = LoggerFactory.getLogger(HomeioSessionClock.class);

    private float timeMultiplier = 1;
    private Date homeioTime = null;
    private Date homeioTimeAddedTime = null;

    private LinkedList<List<Date>> oldHomeioTimes = new LinkedList<List<Date>>();

    private Date realTimeAtLastIncrement = null;
    private long incrementedTimeSinceHomeioTimeAdded = 0;

    private SessionPseudoClock clock = null;

    public HomeioSessionClock(SessionPseudoClock clock) {
        this.clock = clock;
    }

    public void newHomeioTime(Date newHomeioTime) {
        Date realTime = new Date();
        if (homeioTime != null) {
            timeMultiplier = calculateTimeMultiplier(newHomeioTime, realTime);
            logger.error("IncQuery droolsbundle: timeMultiplier: " + timeMultiplier);
            clock.advanceTime(elapsedTimeInHomeio(newHomeioTime) - incrementedTimeSinceHomeioTimeAdded,
                    TimeUnit.MILLISECONDS);
        }

        homeioTime = newHomeioTime;
        homeioTimeAddedTime = realTime;
        incrementedTimeSinceHomeioTimeAdded = 0;
        realTimeAtLastIncrement = null;
    }

    public void advanceClock() {
        clock.advanceTime(getElapsedTime(), TimeUnit.MILLISECONDS);
    }

    public long getHomeioTime() {
        if (homeioTime != null) {
            return homeioTime.getTime() + incrementedTimeSinceHomeioTimeAdded;
        }
        return 0;
    }

    private long getElapsedTime() {
        long elapsedTime = 0;
        if (homeioTime != null) {
            Date realTime = new Date();

            if (realTimeAtLastIncrement != null) {
                elapsedTime = (long) (elapsedRealTimeSinceLastIncrement(realTime) * timeMultiplier * 0.9);
            } else {
                elapsedTime = (long) (elapsedRealTimeSinceHomeioTime(realTime) * timeMultiplier * 0.9);
            }

            realTimeAtLastIncrement = realTime;
            incrementedTimeSinceHomeioTimeAdded += elapsedTime;
        }
        return elapsedTime;
    }

    private int calculateTimeMultiplier(Date newHomeioTime, Date realTime) {
        oldHomeioTimes.add(Arrays.asList(homeioTime, homeioTimeAddedTime));
        if (oldHomeioTimes.size() < 5) {
            return 1;
        }
        if (oldHomeioTimes.size() > 25) {
            oldHomeioTimes.removeFirst();
        }
        Date oldestHomeioTime = oldHomeioTimes.getFirst().get(0);
        Date oldestHomeioTimeAdded = oldHomeioTimes.getFirst().get(1);
        return Math.round((float) (newHomeioTime.getTime() - oldestHomeioTime.getTime())
                / (float) (realTime.getTime() - oldestHomeioTimeAdded.getTime()));

    }

    private long elapsedTimeInHomeio(Date newHomeioTime) {
        return newHomeioTime.getTime() - homeioTime.getTime();
    }

    private long elapsedRealTimeSinceHomeioTime(Date realTime) {
        return realTime.getTime() - homeioTimeAddedTime.getTime();
    }

    private long elapsedRealTimeSinceLastIncrement(Date realTime) {
        return realTime.getTime() - realTimeAtLastIncrement.getTime();
    }
}
