package com.tekwill.learning.flowcontrol.homework;

import java.util.Scanner;

public class AsciiCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 0 to 127:");
        int number = scanner.nextInt();
        if (0 <= number && number < 33 || number == 127) {
            System.out.printf("The character for the ASCII code %d is %s\n", number, AsciiCharactersUpTo32.values()[number]);   // using ordinals, not recommended

            //   System.out.printf("The character for the ASCII code %d is %s\n", number, AsciiCharactersUpTo32.getChar(number));
        } else if (32 < number && number < 127) {
            System.out.printf("The character for the ASCII code %d is %c\n", number, (char) number);
        } else {
            System.out.printf("%d is an invalid input", number);
        }

    }

    enum AsciiCharactersUpTo32 {
        //        NUL, SOH, STX, ETX, EOT, ENQ, ACK, BEL, BS, HT, LF, VT, FF, CR, SO, SI, DLE, DC1, DC2, DC3, DC4, NAK, SYN, ETB, CAN, EM, SUB, ESC, FS, GS, RS, US, Space
        NUL(0), SOH(1), STX(2), ETX(3), EOT(4), ENQ(5), ACK(6), BEL(7), BS(8), HT(9),
        LF(10), VT(11), FF(12), CR(13), SO(14), SI(15), DLE(16), DC1(17), DC2(18), DC3(19),
        DC4(20), NAK(21), SYN(22), ETB(23), CAN(24), EM(25), SUB(26), ESC(27), FS(28), GS(29),
        RS(30), US(31), Space(32), DEL(127);

        public final int index;

        AsciiCharactersUpTo32(int index) {
            this.index = index;
        }

        /*public static String getChar(int index){             // get the constant based on index value
            return constantName???????? ;
        }*/

    }
}
