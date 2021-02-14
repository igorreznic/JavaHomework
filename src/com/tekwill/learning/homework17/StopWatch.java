package com.tekwill.learning.homework17;

import java.time.LocalTime;
import java.util.Arrays;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    // A no-arg constructor that initializes startTime with the current time.
    public StopWatch() {
        this.startTime = LocalTime.now();
        //this.endTime = LocalTime.now();
    }

    public static void main(String[] args) {
        StopWatch stopWatchTest = new StopWatch();

        int[] intArray = new int[100000];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 100000 - i;
        }

        stopWatchTest.start();
        System.out.println("Start: " + stopWatchTest.startTime.getNano());

        Arrays.sort(intArray);

        stopWatchTest.stop();
        System.out.println("Stop: " + stopWatchTest.endTime.getNano());

        System.out.println("Test duration: " + stopWatchTest.getElapsedTime() + " Nanos, or " + stopWatchTest.getElapsedTime() / 1e+6 + " Millis.");

    }

    // A method named start(), that resets the startTime to the current time.
    public void start() {
        this.startTime = LocalTime.now();
    }

    // A method named stop(), that sets the endTime to the current time.
    public void stop() {
        this.endTime = LocalTime.now();

    }

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public long getElapsedTime() {
        return endTime.getNano() - startTime.getNano();
    }

    @Override
    public String toString() {
        return String.valueOf(startTime);
    }

}
