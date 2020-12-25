package com.tekwill.learning.flowcontrol.ifconstruction;

public class CylinderVolumeAndAreaCalculator {
    public static double cylinderArea(float radius, float height) {
        return (Math.PI * Math.pow(radius, 2) * 2) + (2 * Math.PI * radius * height);
    }

    public static double cylinderVolume(float radius, float height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
