package com.tekwill.learning.homework12;

public class PentagonalNumbers {
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(getPentagonalNumber(i + 1) + ", ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }
}
