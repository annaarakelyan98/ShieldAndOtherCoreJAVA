package com.core_java.homework3gorcnakanArman2;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args)
            throws java.io.IOException {
        //1, 14, 4.3
        Scanner num = new Scanner(System.in);
        int i = num.nextInt();
        if (i == 0) {
            System.out.println("Tiv@ 0 e!");
        } else if (i > 0) {
            System.out.println(i + "-@ mec e 0-ic!");
        } else {
            System.out.println(i + "-@ poqr e 0-ic!");
        }
        System.out.println();

        //2, 6, 16
        char ch;
        ch = (char) System.in.read();
        switch (ch) {
            case 'q':
                System.out.println("q");
                break;
            case 'A':
                System.out.println("A");
                break;
            case 'D':
                System.out.println("D");
                break;
            default:
                System.out.println("Chkpav!");
                break;
        }
        System.out.println();

        //9, 3.1
        for (int j = 0; j < 15; j++) {
            System.out.print(j + " ");
            if (j == 6) {
                break;
            }
        }
        System.out.println();

        //3.2, 4.4
        long mult = 1;
        for (int k = 0; k < 10; k++) {
            if (k % 2 == 0) {
                continue;
            } else {
                mult = mult * k;
            }
        }
        System.out.println("\nKenteri artadryal: " + mult);

        //7
        boolean b = true;
        if (b) {
            System.out.println("Tpelu e! " + b + "\n");
        }

        //12, 13, 5
        double sum = 0.0;
        out:
        for (int j = 0; j < 20; j++) {
            for (int k = 0; k < 15; k++) {
                sum += k;
                if (k == 7) break out;
            }
        }
        System.out.println("Sum is: " + sum + "\n");

        //10
        int g = 0;
        int count = 0;
        while (g < 10) {
            if (g % 2 == 0) {
                count++;
            }
            g++;
        }
        System.out.println("Count is: " + count + "\n");


        //11
        float f = 0.0f;
        do {
            if (f == 5.0f) {
                f++;
                continue;
            }
            System.out.println("f is " + f);
            f++;
        } while (f < 10.0f);
    }
}
