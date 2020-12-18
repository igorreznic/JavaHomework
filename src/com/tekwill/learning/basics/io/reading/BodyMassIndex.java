package com.tekwill.learning.basics.io.reading;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        final float INCHES_TO_METERS_CONVERSION_RATIO = 0.0254F;
        final float KG_TO_POUNDS_CONVERSION_RATIO = 2.205F;

        System.out.println("Please enter Your height in feet and inches:\n" +
                "Firstly, enter feet:");
        int heightInFeet = scanner.nextInt();
        System.out.println("Now, enter inches:");
        int heightInInches = scanner.nextInt();
        System.out.println("Now, enter Your weight in pounds:");
        float weightInPounds = scanner.nextFloat();
        int generalHeightInInches = heightInFeet*12 + heightInInches;
        double bodyMassIndex = (weightInPounds/KG_TO_POUNDS_CONVERSION_RATIO)/Math.pow(generalHeightInInches*INCHES_TO_METERS_CONVERSION_RATIO,2);
        System.out.printf("Your Body Mass Index is: %.4f", bodyMassIndex);

    }
}
