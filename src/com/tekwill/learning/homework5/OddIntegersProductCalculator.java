package com.tekwill.learning.homework5;

public class OddIntegersProductCalculator {
    public static int product = 1;

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                product *= i;
            }
        }
        System.out.println("The product of odd integers from 1 to 15 is: " + product);
    }
}
