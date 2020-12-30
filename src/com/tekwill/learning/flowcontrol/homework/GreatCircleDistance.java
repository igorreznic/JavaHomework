package com.tekwill.learning.flowcontrol.homework;

import java.util.Scanner;

public class GreatCircleDistance {

    public static double calculateGreatCircleDistance(float p1Latitude, float p1Longitude, float p2Latitude, float p2Longitude) {
        final double RADIUS = 6371.01;
        double x1 = Math.toRadians(p1Latitude);
        double y1 = Math.toRadians(p1Longitude);
        double x2 = Math.toRadians(p2Latitude);
        double y2 = Math.toRadians(p2Longitude);

        return RADIUS * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude in range -90 to 90 and longitude in range -180 to 180) in degrees: ");
        float p1Latitude = scanner.nextFloat();
        float p1Longitude = scanner.nextFloat();

        System.out.println("Enter point 2 (latitude in range -90 to 90 and longitude in range -180 to 180) in degrees: ");
        float p2Latitude = scanner.nextFloat();
        float p2Longitude = scanner.nextFloat();
        System.out.printf("The distance between the two points is: %f km", calculateGreatCircleDistance(p1Latitude, p1Longitude, p2Latitude, p2Longitude));


    }
}
