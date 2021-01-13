package com.tekwill.learning.homework6;

public class PICalculator {

    public static double value = 4;
    public static double n = 3;

    public static double getValue() {
        for (int i = 0; i < 100000; i++) {
            value = value - 4.0 / n + 4.0 / (n + 2);
            n += 4;
        }
        return value;
    }

    // about 137000 terms of calculation to get a value of 3.14159....


}
