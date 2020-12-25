package com.tekwill.learning.flowcontrol.ifconstruction;

import java.util.Scanner;

import static com.tekwill.learning.flowcontrol.ifconstruction.CylinderVolumeAndAreaCalculator.cylinderArea;
import static com.tekwill.learning.flowcontrol.ifconstruction.CylinderVolumeAndAreaCalculator.cylinderVolume;

public class CylinderVolumeAndAreaCalculatorDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius and height of a cylinder splitted by space");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        float radius = Float.parseFloat(numbers[0]);
        float height = Float.parseFloat(numbers[1]);

        System.out.printf("The cylinder area is: %.2f\n", cylinderArea(radius, height));
        System.out.printf("The cylinder volume is: %.2f", cylinderVolume(radius, height));
    }
}
