package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class SumOfDigitsCalculator {
    private int number;

    private int hundreds;
    private int tens;
    private int units;

    private int sumOfDigits;

    public SumOfDigitsCalculator(int number) {
        this.number = number;
        hundreds = number / 100;
        tens = (number % 100) / 10;
        units = (number % 100) % 10;
        sumOfDigits = hundreds + tens + units;
    }
    //@Override
    //public String toString() {
    //    return String.valueOf(sumOfDigits);
    //}

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000");
        int number = scanner.nextInt();
        System.out.println("The sum of digits is: " + new SumOfDigitsCalculator(number).sumOfDigits);   // Asa e ok???? ca sa nu folosim toString()
    }
}
