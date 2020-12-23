package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class NumberCounter {
    static int count0;
    static int countPositive;
    static int countNegative;

    public static void countNumbers(int n) {
        if (n == 0) {
            count0 += 1;
        } else if (n > 0) {
            countPositive += 1;
        } else {
            countNegative += 1;
        }
    }

    // Just pretend it's NumberCounterDemo Class


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five numbers (positive, negative and/or zero):");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();
        int n5 = scanner.nextInt();

        countNumbers(n1);
        countNumbers(n2);
        countNumbers(n3);
        countNumbers(n4);
        countNumbers(n5);

        System.out.println(count0 + " of zero\n" + countPositive + " positive numbers\n" + countNegative + " negative numbers");

    }
}
