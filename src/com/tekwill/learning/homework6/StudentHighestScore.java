package com.tekwill.learning.homework6;

import java.util.Scanner;

public class StudentHighestScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students, and then the name and score for each student:");
        int numberOfStudents = scanner.nextInt();
        String currentStudentName = scanner.next();
        int highestScore = scanner.nextInt();
        for (int i = 1; i < numberOfStudents; i++) {
            String studentName = scanner.next();
            int studentScore = scanner.nextInt();
            if (highestScore < studentScore) {
                highestScore = studentScore;
                currentStudentName = studentName;
            }
        }
        System.out.println("Highest score: " + currentStudentName + " " + highestScore);
    }
}
