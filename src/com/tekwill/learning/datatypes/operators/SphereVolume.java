package com.tekwill.learning.datatypes.operators;

public class SphereVolume {
    public static final double PI = Math.PI;

    public static double sphereVolume(double r) {
        double sphereVolume = 4 / 3D * PI * Math.pow(r, 3);
        return sphereVolume;
    }

    public static void main(String[] args) {

        System.out.println(sphereVolume(10));
    }

}
