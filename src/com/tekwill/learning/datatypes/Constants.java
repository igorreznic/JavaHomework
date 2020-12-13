package com.tekwill.learning.datatypes;

public class Constants {
    public static final double pi = Math.PI;    //3.141592653589793238462643;
    public static final double e = Math.E;    //2.718281828459045235360287;
    public static final double i = Math.sqrt(-1);  // i**2 = -1
    public static final double squareRootOf2 = Math.sqrt(2);
    public static final double goldenRatio = (1 + Math.sqrt(5)) / 2;
    public static byte zero = 0;
    public static byte one = 1;

    public static void main(String[] args) {
        System.out.println("zero: " + zero);
        System.out.println("one: " + one);
        System.out.println("pi: " + pi);
        System.out.println("e: " + e);
        System.out.println("imaginary unit, i: " + i);
        System.out.println("Square Root of 2: " + squareRootOf2);
        System.out.println("Golden Ratio: " + goldenRatio);
    }
}
