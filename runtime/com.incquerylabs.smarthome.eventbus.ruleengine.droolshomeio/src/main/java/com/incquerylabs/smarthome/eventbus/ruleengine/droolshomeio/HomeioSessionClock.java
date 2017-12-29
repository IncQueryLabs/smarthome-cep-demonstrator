package com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.eclipse.smarthome.core.items.Item;
import org.eclipse.smarthome.core.library.types.DateTimeType;
import org.eclipse.smarthome.core.library.types.DecimalType;
import org.kie.api.time.SessionPseudoClock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeioSessionClock {
    static Logger logger = LoggerFactory.getLogger(HomeioSessionClock.class);
    
    //The HomeIO time scale
	private float timeScale = 1;
	
	//Used for the time underestimation
	private float timeSlowerFactor = 0.9f;
	
	//The last updated HomeIO time value
	private Date lastHomeioTime = null;
	
	//The real time, when the session clock was last advanced
	private Date realTimeAtLastAdvance = null;
	
	//The total advance of time in the session clock, since the last HomeIO time update
	private long advancedTimeSinceHomeioTimeUpdated = 0;
	
	//The Drools session clock. Can be used to advance time in Drools
	private final SessionPseudoClock droolsSessionClock;

    public HomeioSessionClock(SessionPseudoClock clock) {
        this.droolsSessionClock = clock;
    }

    public void newHomeioTime(Item homeioDate) {
        newHomeioTime(((DateTimeType) homeioDate.getState()).getCalendar().getTime());
    }

    public void newHomeioTime(Date newHomeioTime) {
        Date realTime = new Date();
        if (lastHomeioTime != null) {
            droolsSessionClock.advanceTime(
            		elapsedTimeInHomeio(newHomeioTime) 
            		- advancedTimeSinceHomeioTimeUpdated,
                    TimeUnit.MILLISECONDS);
        }

        lastHomeioTime = newHomeioTime;
        realTimeAtLastAdvance = realTime;
        advancedTimeSinceHomeioTimeUpdated = 0;
    }
    
    public void setTimeScale(Item timeScaleItem) {
    	this.timeScale = ((DecimalType) timeScaleItem.getState()).floatValue();
    }

    public void advanceClock() {
        droolsSessionClock.advanceTime(
        		getElapsedTimeSinceLastAdvance(),
        		TimeUnit.MILLISECONDS);
    }

    public long getHomeioTime() {
        if (lastHomeioTime != null) {
            return lastHomeioTime.getTime() 
            		+ advancedTimeSinceHomeioTimeUpdated;
        }
        return 0;
    }

    private long getElapsedTimeSinceLastAdvance() {
        long elapsedTime = 0;
        if (lastHomeioTime != null && realTimeAtLastAdvance != null) {
            Date realTime = new Date();
            elapsedTime = (long) (
            		elapsedRealTimeSinceLastAdvance(realTime)
            		* timeScale 
            		* timeSlowerFactor);
            realTimeAtLastAdvance = realTime;
            advancedTimeSinceHomeioTimeUpdated += elapsedTime;
        }
        return elapsedTime;
    }

    private long elapsedTimeInHomeio(Date newHomeioTime) {
        return newHomeioTime.getTime() - lastHomeioTime.getTime();
    }

    private long elapsedRealTimeSinceLastAdvance(Date realTime) {
        return realTime.getTime() - realTimeAtLastAdvance.getTime();
    }
}
