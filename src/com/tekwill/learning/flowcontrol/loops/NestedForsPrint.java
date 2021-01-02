package com.tekwill.learning.flowcontrol.loops;

public class NestedForsPrint {


    //       Varianta  10+1-i
    public static void trianglePrint(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" -");
            }
            for (int k = 1; k <= (n + 1 - i) * 2 - 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

//        Varianta din clasa

    //        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//            for (int k = i; k < 10; k++) {
//                System.out.print(" *");
//            }
//            for (int k = i; k < 9; k++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
    public static void main(String[] args) {

        trianglePrint(10);
    }
}
