package com.core_java.homework3gorcnakanArman2;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        //3, 4
        Random random = new Random();
        int i = random.nextInt(100);
        if (i % 2 == 0) {
            System.out.println(i + " zuyg e!");
        } else {
            System.out.println(i + " kent e!");
        }
        System.out.println();

        //5
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println("\n");

        //6
        int k = 1;
        while (k <= 100) {
            if (k % 3 == 0) {
                System.out.println("k is: " + k);
            }
            k++;
        }
        System.out.println();

        //array
        int[] a = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        System.out.print("My array is: " + a[0] + ", " + a[1] + ", " + a[2] + ", " + a[3]);
        System.out.println("\n");

        //7
        int[] a1 = new int[20];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;
        a1[4] = 5;
        a1[5] = 6;
        a1[6] = 7;
        a1[7] = 8;
        a1[8] = 9;
        a1[9] = 10;
        a1[10] = 11;
        a1[11] = 12;
        a1[12] = 13;
        a1[13] = 14;
        a1[14] = 15;
        a1[15] = 16;
        a1[16] = 17;
        a1[17] = 18;
        a1[18] = 19;
        a1[19] = 20;

        int sum = 0;
        long mult = 1;

        for (int j = 0; j < a1.length; j++) {
            if (a1[j] % 2 != 0) {
                mult *= a1[j];
            } else {
                sum += a1[j];
            }
        }
        System.out.println("Kenteri artadryal: " + mult);
        System.out.println("Zuygeri gumar: " + sum + "\n");

        //9
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76,
                77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        int count = 0;
        int max = array[0];
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 5 == 0) {
                count++;
            }
            if (max < array[j]) {
                max = array[j];
            }
            if (min > array[j]) {
                min = array[j];
            }
        }
        System.out.println("5i bajanvoxneri qanak@! " + count);
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min + "\n");

        //10
        byte[] b = new byte[6];
        b[0] = 2;
        b[1] = 5;
        b[2] = 39;
        b[3] = 8;
        b[4] = 127;
        b[5] = 28;

        System.out.println("b[0] = " + b[0]);
        System.out.println("b[1] = " + b[1]);
        System.out.println("b[2] = " + b[2]);
        System.out.println("b[3] = " + b[3]);
        System.out.println("b[4] = " + b[4]);
        System.out.println("b[5] = " + b[5]);
        System.out.println();

        //11
        double[] d = new double[10];
        d[0] = 2.5;
        d[1] = -2.5;
        d[2] = 0.7;
        d[3] = -10.5;
        d[4] = -5.2;
        d[5] = 6.3;
        d[6] = -2.0;
        d[7] = -52.5;
        d[8] = 12.1;
        d[9] = 2.9;

        int count1 = 0;
        for (int j = 0; j < d.length; j++) {
            if (d[j] < 0) {
                count1++;
            }
        }
        System.out.print("My array is` {" + d[0] + ", " + d[1] + ", " + d[2] + ", " + d[3] + ", " + d[4] + ", " + d[5] +
                ", " + d[6] + ", " + d[7] + ", " + d[8] + ", " + d[9] + "}\n");
        System.out.println("Bacasakanneri qanak: " + count1);
    }
}