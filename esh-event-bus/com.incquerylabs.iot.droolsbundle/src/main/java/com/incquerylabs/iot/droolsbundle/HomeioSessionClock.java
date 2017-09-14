package com.incquerylabs.iot.droolsbundle;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.kie.api.time.SessionPseudoClock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeioSessionClock {
    static Logger logger = LoggerFactory.getLogger(HomeioSessionClock.class);

    private float timeMultiplier = 1;
    private Date homeioTime = null;
    private Date homeioTimeAddedTime = null;
    private Date realTimeAtLastIncrement = null;
    private long incrementedTimeSinceHomeioTimeAdded = 0;
    private SessionPseudoClock clock = null;

    public HomeioSessionClock(SessionPseudoClock clock) {
        this.clock = clock;
    }

    public void newHomeioTime(Date newHomeioTime) {
        Date realTime = new Date();
        if (homeioTime != null) {
            timeMultiplier = Math.round(
                    (float) elapsedTimeInHomeio(newHomeioTime) / (float) elapsedRealTimeSinceHomeioTime(realTime));

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
