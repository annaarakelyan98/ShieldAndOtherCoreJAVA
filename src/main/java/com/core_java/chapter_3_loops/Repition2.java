package com.core_java.chapter_3_loops;

import java.util.Scanner;

public class Repition2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        //for
        double sroot;
        for (double i = 1.0; i < 100.0; i++) {
            sroot = Math.sqrt(i);
            System.out.println("Square root numbers! " + sroot);
        }

        System.out.println();

        //while
        int i = 1;
        while (i <= 10) {
            System.out.println("i is: " + i);
            i++;
        }
        System.out.println();

        //
        int e, result;

        for (int j = 0; j < 5; j++) {
            result = 1;
            e = j;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2's " + j + " second degree = e " + result);
        }

        System.out.println();

        //do-while
        int sum = 0, k = 1;
        do {
            sum += k;
            System.out.println("sum is: " + sum);
        } while (sum != 10);

        System.out.println();

        //break
        for (int j = 0; j < 100; j++) {
            if (j * j > 100) break;
            System.out.println(j + " 2nd degree: " + j * j);
        }

        System.out.println();

        //continue
        int sum1 = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) continue;
            sum1 += arr[j];
            System.out.print(arr[j] + " ");
        }
        System.out.println("\nsum is: " + sum1);

        System.out.println();

        //metka// nerdrvac cikler
        for (int j = 0; j < 10; j++) {
            one:
            for (int m = 0; m < 10; m++) {
                if (m == 3) break one;
                System.out.println("j and m: " + j + " " + m);
            }
            System.out.println();
        }

        //bubble sorting algorithm
        int[] a = {5, 2, 3, 9, 6};
        for (int m = 0; m < a.length; m++) {
            for (int n = 0; n < a.length - 1; n++) {
                int f;
                if (a[n] < a[n + 1]) {
                    f = a[n];
                    a[n] = a[n + 1];
                    a[n + 1] = f;
                }
            }
        }

        for (int m = 0; m < a.length; m++) {
            System.out.print(a[m] + ", ");
        }
    }
}
