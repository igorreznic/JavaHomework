package com.tekwill.learning.homework7;

public class NumbersDivisibleBy5and6 {
    public static int n = 0;

    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                n++;
            }
            if (n == 10) {
                System.out.println();
                n = 0;
            }
        }
    }
}
