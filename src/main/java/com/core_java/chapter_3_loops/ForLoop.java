package com.core_java.chapter_3_loops;

public class ForLoop {
    public static void main(String[] args)
            throws java.io.IOException {

        //1...+
        double num, sqrt, error;
        for (num = 0; num < 100; num++) {
            sqrt = Math.sqrt(num);
            System.out.println("Qarakusi armat: " + sqrt);
            error = num - sqrt * sqrt;
            System.out.println("Sxalanq: " + error);
            System.out.println();
        }


        //2...-
        int x;
        for (x = 100; x >= -95; x -= 5) {
            System.out.println("x: " + x);
        }
        System.out.println();

        //3...2 with variables
        int i, j;
        for (i = 0, j = 15; i < j; i++, j--) {
            System.out.println("i and j: " + i + " and " + j);
        }
        System.out.println();

        //4... write from keyboard
        System.out.println("To stop click 'S'!");
        for (i = 0; (char) (System.in.read()) != 'S'; i++) {
            System.out.println("Move # " + i);
        }

        //5...initialization
        int h;
        for (h = 0; h < 10; ) {
            System.out.println("h is: " + h);
            h += 2;
        }
        System.out.println();

        //6...
        int g;
        g = 0;
        for (; g < 14; ) {
            System.out.println("g is: " + g);
            g++;
        }
        System.out.println();

        //7... infinite loop
       /* for (;;){
            System.out.println("aa");
        }*/

        //8... without body
        int sum, l;
        sum = 0;
        for (l = 1; l < 6; sum += l++) ;// ; - after loop that doesn't have body
        System.out.println("Sum is: " + sum);
        System.out.println();

        //9
        int sum1, fact;
        sum1 = 0;
        fact = 1;
        for (int i2 = 1; i2 < 7; i2++) {
            sum1 += i2;
            fact *= i2;
        }
        System.out.println("Sum is: " + sum1 + "\n" + "Factorial is: " + fact);
    }
}
