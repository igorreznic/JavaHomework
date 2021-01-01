package com.tekwill.learning.flowcontrol.loops;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1 to 10:");
        int number = scanner.nextInt();
        String roman;
        switch (number) {
            case 1:
                roman = "I";
                break;
            case 2:
                roman = "II";
                break;
            case 3:
                roman = "III";
                break;
            case 4:
                roman = "IV";
                break;
            case 5:
                roman = "V";
                break;
            case 6:
                roman = "VI";
                break;
            case 7:
                roman = "VII";
                break;
            case 8:
                roman = "VIII";
                break;
            case 9:
                roman = "IX";
                break;
            case 10:
                roman = "X";
                break;
            default:
                roman = "Error message!!!";
        }
        if (1 <= number && number <= 10) {
            System.out.printf("The roman numeral of %d is %s", number, roman);
        } else {
            System.out.println(roman);
        }
    }
}
