package com.tekwill.learning.homework7;

public class BetweenFeetAndMeterConverter {
    public static double FEET_TO_METERS_RATIO = 0.305;
    public static double METERS_TO_FEET_RATIO = 3.279;

    public static double feetToMeters(double feet) {
        return feet * FEET_TO_METERS_RATIO;
    }

    public static double metersToFeet(double meters) {
        return meters * METERS_TO_FEET_RATIO;
    }

    public static void main(String[] args) {
        System.out.println(" Feet     Meters     |      Meters      Feet\n" +
                "_____________________________________________");
        double feet = 1.0;
        double meters = 20.0;

        while (feet <= 10) {
            System.out.printf("%5.1f %10.3f     | %10.1f %10.3f\n", feet, feetToMeters(feet), meters, metersToFeet(meters));
            feet++;
            meters += 5;
        }
    }
}
