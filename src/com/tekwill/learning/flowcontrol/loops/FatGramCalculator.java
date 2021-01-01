package com.tekwill.learning.flowcontrol.loops;

import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total calories for 100g of product and fat grams:");
        int calories = scanner.nextInt();
        int fatGram = scanner.nextInt();

        if ((fatGram * 9.0) / calories * 100 >= 30 && (fatGram * 9.0) / calories * 100 <= 100) {
            System.out.printf("The share of fat calories is %.2f %%", (fatGram * 9.0) / calories * 100);
        } else if ((fatGram * 9.0) / calories * 100 >= 0 && (fatGram * 9.0) / calories * 100 < 30) {
            System.out.printf("The product is low fat, and the share of fat calories is %.2f %%", (fatGram * 9.0) / calories * 100);
        } else System.out.println("Wrong input combination!!!");
    }
}
