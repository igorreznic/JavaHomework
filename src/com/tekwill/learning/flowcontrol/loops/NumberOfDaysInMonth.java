package com.tekwill.learning.flowcontrol.loops;

import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number 1-12:");
        int month = scanner.nextInt();
        int days = 0;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                System.out.println("Error!!! Wrong month number.");
        }
        if (1 <= month && month <= 12) System.out.println(days + " days");

    }
}
