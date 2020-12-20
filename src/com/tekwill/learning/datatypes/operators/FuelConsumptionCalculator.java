package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class FuelConsumptionCalculator {

    public static float milesPerGallon(float distance, float fuelVolume) {
        return distance / fuelVolume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fuel Consumption Calculator \nEnter how many Miles you have driven: ");
        float distance = scanner.nextFloat();
        System.out.println("How many gallons of gasoline you have used:");
        float fuelVolume = scanner.nextFloat();

        System.out.printf("Your consumption is %.2f MPG", milesPerGallon(distance, fuelVolume));
    }
}
