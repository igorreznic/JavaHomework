package com.tekwill.learning.homework8;

public class PatternsDisplay {

    public static void displayPatternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void displayPatternB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void displayPatternC(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n + 1 - i; k > 1; k--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void displayPatternD(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        displayPatternA(6);

        System.out.println();
        displayPatternB(6);

        System.out.println();
        displayPatternC(6);

        System.out.println();
        displayPatternD(6);
    }
}
