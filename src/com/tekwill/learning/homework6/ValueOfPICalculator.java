package com.tekwill.learning.homework6;

public class ValueOfPICalculator {
    public static void main(String[] args) {
        double value = 4;
        double n = 3;

        for (int i = 0; i < 100000; i++) {
            value = value - 4.0 / n + 4.0 / (n + 2);
            n += 4;
        }
        System.out.printf("PI = %.20f", value);
        // about 137000 terms of calculation to get a value of 3.14159....
    }
}
