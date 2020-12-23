package com.tekwill.learning.datatypes.operators;

public class TimeKeeper {
    public static final int HOURS_IN_A_DAY = 24;
    public static final int MINUTES_IN_AN_HOUR = 60;
    public static final int SECONDS_IN_A_MINUTE = 60;

    private long totalSeconds;
    private long days;
    private long hours;
    private long minutes;
    private long remainingSeconds;

    public TimeKeeper(long totalSeconds) {
        this.totalSeconds = totalSeconds;
        days = (totalSeconds / (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE));
        hours = (totalSeconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) / (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE);
        minutes = ((totalSeconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) / SECONDS_IN_A_MINUTE;
        remainingSeconds = ((totalSeconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % SECONDS_IN_A_MINUTE;

    }

    @Override
    public String toString() {
        return totalSeconds + " seconds = " +
                days + " Days, " +
                hours + " Hours, " +
                minutes + " Minutes, " +
                remainingSeconds + " Seconds";
    }

}
