package com.tekwill.learning.homework5;

import java.util.Scanner;

public class DistanceTraveledTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed (miles/hour) of the vehicle and the hours it has traveled:");
        int speed = scanner.nextInt();
        int hours = scanner.nextInt();
        System.out.println("Hours   Distance Traveled");

        for (int i = 1; i <= hours; i++) {
            System.out.println(i + "             " + speed * i);
        }

    }
}
