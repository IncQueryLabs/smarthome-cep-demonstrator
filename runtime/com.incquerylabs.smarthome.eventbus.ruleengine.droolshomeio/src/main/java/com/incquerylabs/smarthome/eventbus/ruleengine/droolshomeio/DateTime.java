package com.incquerylabs.smarthome.eventbus.ruleengine.droolshomeio;

import java.util.Calendar;
import java.util.Date;

public class DateTime {

    private Calendar calendar = null;
    private String name = null;

    public DateTime(String name, Date date) {
        calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getSecondsOfMinute() {
        return calendar.get(Calendar.SECOND);
    }

    public Integer getMinutesOfHour() {
        return calendar.get(Calendar.MINUTE);
    }

    public Integer getHoursOfDay() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public Integer getDayOfWeek() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public Integer getDayOfMonth() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public Integer getWeekOfMonth() {
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    public Integer getWeekOfYear() {
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public Integer getMonthOfYear() {
        return calendar.get(Calendar.MONTH);
    }

    public Integer getDayOfYear() {
        return calendar.get(Calendar.DAY_OF_YEAR);
    }
}
