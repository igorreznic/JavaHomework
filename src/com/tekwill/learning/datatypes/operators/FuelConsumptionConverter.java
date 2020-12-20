package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class FuelConsumptionConverter {
    public static final float KM_TO_MILES_CONVERTER = 0.621371F;
    public static final float GALON_TO_LITERS_CONVERTER = 3.7854F;

    public static float EU_to_US_ConsumptionConverter(float consumptionInEU_Format) {
        float consumptionInUS_Format = 1 / ((consumptionInEU_Format / GALON_TO_LITERS_CONVERTER) / (KM_TO_MILES_CONVERTER * 100));
        return consumptionInUS_Format;
    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Please enter automobile gasoline consumption in liters/100km:");
        float consumption = scaner.nextFloat();
        System.out.printf("The consumption in US format is: %.2f MPG", EU_to_US_ConsumptionConverter(consumption));
    }

}
