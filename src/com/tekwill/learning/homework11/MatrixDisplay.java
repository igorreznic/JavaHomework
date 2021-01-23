package com.tekwill.learning.homework11;

import java.util.Random;
import java.util.Scanner;

public class MatrixDisplay {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sign = random.nextInt(2);
                if (sign == 1) {
                    System.out.print("\u2B1B ");
                } else
                    System.out.print("\u2B1A ");
            }
            System.out.println();
        }
    }
}
