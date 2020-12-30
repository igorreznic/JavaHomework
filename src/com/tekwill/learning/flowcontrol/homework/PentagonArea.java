package com.tekwill.learning.flowcontrol.homework;

import java.util.Scanner;

public class PentagonArea {

    public static double calculatePentagonArea(float r) {    // r is the length from the center to a vertex
        double s = 2 * r * Math.sin(Math.PI / 5);
        return 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex:");
        float r = scanner.nextFloat();
        System.out.printf("The pentagon area is %.2f", calculatePentagonArea(r));
    }
}
