package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

public class TipsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate splitted by space");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        float subtotal = Float.parseFloat(numbers[0]);
        int tipRate = Integer.parseInt(numbers[1]);
        float gratuity = subtotal * tipRate / 100;
        float total = subtotal + gratuity;
        System.out.printf("The gratuity is $%.2f and the total is $%.2f", gratuity, total);
    }
}
