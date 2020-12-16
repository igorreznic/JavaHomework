package com.tekwill.learning.basics.io.reading;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your height in inches: (Should be in range 60 - 85 inches)");
        int height = scanner.nextInt();
        int heightInFeet = height / 12;
        int inches = height % 12;

        System.out.println("Your height is " + heightInFeet + " feet, " + inches + " inches");
    }
}
