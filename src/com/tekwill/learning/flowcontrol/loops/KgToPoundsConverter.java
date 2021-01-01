package com.tekwill.learning.flowcontrol.loops;

public class KgToPoundsConverter {
    public static double KG_TO_POUNDS_RATIO = 2.20462;

    public static void main(String[] args) {
        System.out.println("Kilograms     Pounds   |   Pounds       Kilograms");
        for (int i = 1, j = 20; i < 200; i++, j += 5) {
            if (j < 520) {
                System.out.printf("%-5d   %10.1f     |    %-4d      %10.2f\n", i, i * KG_TO_POUNDS_RATIO, j, j / KG_TO_POUNDS_RATIO);
            } else {
                System.out.printf("%-5d   %10.1f     |\n", i, i * KG_TO_POUNDS_RATIO);
            }
        }
    }
}
