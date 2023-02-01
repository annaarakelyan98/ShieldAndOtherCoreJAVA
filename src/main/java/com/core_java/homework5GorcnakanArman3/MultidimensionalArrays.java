package com.core_java.homework5GorcnakanArman3;

import java.util.Random;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        //1//3*4 array //1-12 numbers
        int[][] array = new int[3][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i * 4) + j + 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //2
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //3
        int[][] sqrs = {
                {1, 1},
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100},
        };

        for (int i = 0; i < sqrs.length; i++) {
            for (int j = 0; j < sqrs[i].length; j++) {
                System.out.print(sqrs[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //4
        Random r = new Random();
        int[][] ar = new int[3][4];
        int max = ar[0][0];
        int min = ar[0][0];
        int sum = 0;
        int mult = 1;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = r.nextInt(10);

                System.out.print(ar[i][j] + " ");

                sum += ar[i][j];
                mult *= ar[i][j];

                if (ar[i][j] > max) {
                    max = ar[i][j];
                }
                if (ar[i][j] < min) {
                    min = ar[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nmax is: " + max);
        System.out.println("min is: " + min);
        System.out.println("Mijin: " + sum / ar.length);
        System.out.println("Mult is: " + mult);

        System.out.println();

        //5
        int[][] ankyun = new int[3][3];
        int sum1 = 0;

        for (int i = 0; i < ankyun.length; i++) {
            for (int j = 0; j < ankyun[i].length; j++) {
                ankyun[i][j] = i * 3 + j + 1;

                System.out.print(ankyun[i][j] + " ");

                if (i == j) {
                    sum1 += ankyun[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\n" + sum1 + " is sum of diagonal's members");

        System.out.println();

        //6
        int[][] arr6 = new int[5][5];

        for (int i = 0; i < arr6.length; i++) {
            for (int j = 0; j < arr6[i].length; j++) {

                if (i == j) {
                    arr6[i][j] = 1;
                } else arr6[i][j] = 0;

                System.out.print(arr6[i][j] + " ");
            }
            System.out.println();
        }
    }
}