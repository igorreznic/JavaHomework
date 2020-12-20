package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class ShareInWorldPopulation {
    public static long currentWorldPopulation = 7833500000L;

    public static float shareInWorldPopulationByCountry(long countryPopulation) {
        float sharePercentage = (float) countryPopulation / currentWorldPopulation * 100;
        return sharePercentage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The World Population is " + currentWorldPopulation + "\n Enter the US Population:");

        long US_population = scanner.nextLong();     // US_population = 331927900L;
        System.out.printf("The Population of the US is %.5f%%  of the World Population", shareInWorldPopulationByCountry(US_population));
    }

}
