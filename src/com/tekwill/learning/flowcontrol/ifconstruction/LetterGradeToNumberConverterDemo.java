package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

import static com.tekwill.learning.flowcontrol.ifconstruction.LetterGradeToNumberConverter.convertToNumber;

public class LetterGradeToNumberConverterDemo {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an uppercase letter from A to F:");
        char letter = scanner.next().charAt(0);
        convertToNumber(letter);
    }
}
