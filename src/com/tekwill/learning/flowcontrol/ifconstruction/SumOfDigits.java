package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class SumOfDigits {

    static int hundreds;
    static int tens;
    static int units;


//              the hint was just 5*****

    public static int SumOfDigitsCounter(int number) {
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = (number % 100) % 10;
        return hundreds + tens + units;
    }


    //              Pretend down is a Demo Class


    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000");
        int number = scanner.nextInt();
        System.out.println("The sum of digits is: " + SumOfDigitsCounter(number));
    }
}
