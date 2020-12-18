package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class SecondsConverter {
    public static final int HOURS_IN_A_DAY = 24;
    public static final int MINUTES_IN_AN_HOUR = 60;
    public static final int SECONDS_IN_A_MINUTE = 60;

    public static int convertToDays(long seconds) {
        int result = (int) (seconds / (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE));
        return result;
    }

    public static int convertRemainingToHours(long seconds) {
        int result = (int) (seconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) / (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE);
        return result;
    }

    public static int convertRemainingToMinutes(long seconds) {
        int result = (int) ((seconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) / SECONDS_IN_A_MINUTE;
        return result;
    }

    public static int getRemainingSeconds(long seconds) {
        int result = (int) ((seconds % (HOURS_IN_A_DAY * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % (MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE)) % SECONDS_IN_A_MINUTE;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of seconds:");
        long numberOfSeconds = scanner.nextLong();

        System.out.println(numberOfSeconds + " seconds = " + convertToDays(numberOfSeconds) + " days, " + convertRemainingToHours(numberOfSeconds) + " hours, "
                + convertRemainingToMinutes(numberOfSeconds) + " minutes, " + getRemainingSeconds(numberOfSeconds) + " seconds");

    }
}
