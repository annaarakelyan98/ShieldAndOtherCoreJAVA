package com.core_java.chapter_3_loops;

import java.io.IOException;

public class WhileLoop {
    public static void main(String[] args) throws IOException {
        //while

        //1 / book
        char ch = 'a';
        while (ch <= 'z') {
            System.out.println("Letter is: " + ch);
            ch++;
        }
        System.out.println();

        //2 /book
        int e, result;
        for (int i = 0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2's " + i + " degree is " + result);
        }
        System.out.println();

        //3 boolean and break / Gosh
        boolean isTrue = true;
        int i = 0;
        while (isTrue) {
            System.out.println("i is: " + i);
            i += 3;
            if (i == 15) {
                break;
            }
        }
        System.out.println();

        //do while
        //1 /book
        char ch1, ignore;
        do {
            System.out.print("import symbol: ");
            ch1 = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

//            if (ch1 == '\n') {
//                System.out.println("NEW LINE");
//                continue;
//            }
        } while (ch1 != 'q');

        //2 /book
       /* char ch2, ignore, answer = 'K';
        do {
            System.out.println("A-Z interval");
            System.out.print("import e: ");

            ch2 = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch2 == answer) {
                System.out.println("Right!");
            } else if (ch2 > answer) {
                System.out.println("Close to alphabet end!");
            } else {
                System.out.println("Close to alphabet start");
            }
        } while (answer != ch2);*/


    }
}
