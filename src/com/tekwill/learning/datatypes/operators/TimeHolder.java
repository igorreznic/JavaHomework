package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class TimeHolder {
    public static final int HOURS_IN_A_DAY = 24;
    public static final int MINUTES_IN_AN_HOUR = 60;
    public static final int SECONDS_IN_A_MINUTE = 60;
    public long totalSeconds;
    public int days;
    public int hours;
    public int minutes;
    public int remainingSeconds;

    public TimeHolder(long seconds) {
        totalSeconds = seconds;
        days = (int) (seconds / (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE));
        hours = (int) (seconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) / (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE);
        minutes = (int) ((seconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) / SECONDS_IN_A_MINUTE;
        remainingSeconds = (int) ((seconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % SECONDS_IN_A_MINUTE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of seconds:");
        long seconds = scanner.nextLong();

        System.out.println(new TimeHolder(seconds));

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
