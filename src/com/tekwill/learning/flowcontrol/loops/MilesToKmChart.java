package com.tekwill.learning.flowcontrol.loops;

public class MilesToKmChart {
    public static final double MILES_TO_KM = 1.6093;

    public static void main(String[] args) {
        System.out.println("Miles          Km");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-12d   %-20.4f\n", i, i * MILES_TO_KM);
        }
    }
}
