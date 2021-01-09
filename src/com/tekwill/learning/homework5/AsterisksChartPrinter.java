package com.tekwill.learning.homework5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AsterisksChartPrinter {
    public static void main(String[] args) {
        System.out.println("Enter 5 numbers, in range 1 to 30");
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList();

        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }
        for (int number : numbers) {
            System.out.printf("%2d ", number);
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
