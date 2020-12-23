package com.tekwill.learning.datatypes.operators;

import java.util.Scanner;

public class TimeKeeperDemo {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of seconds:");
        long seconds = scanner.nextLong();
        System.out.println(new TimeKeeper(seconds));

        System.out.println("Please enter the number of seconds:");
        seconds = scanner.nextLong();
        System.out.println(new TimeKeeper(seconds));

        System.out.println("Please enter the number of seconds:");
        seconds = scanner.nextLong();
        System.out.println(new TimeKeeper(seconds));

    }
}
