package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class DecimalToHexConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15)");
        int decimal = scanner.nextInt();
        if (0 <= decimal && decimal <= 15) {
            System.out.printf("The hex value for %d is %s", decimal, Integer.toHexString(decimal));
        } else {
            System.out.println(decimal + " is an invalid input");
        }
    }
}
