package com.core_java.homework3gorcnakanArman2;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //1
        int a = 8;
        int b = 21;
        System.out.println("a and b: " + a + " " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("a and b: " + a + " " + b);
        System.out.println();

        //2 bubble sorting algorithm
        int[] array = new int[]{4, 2, 8, 6};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int f = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = f;
                }
            }
        }
        System.out.print("array[i] = ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        //3
        int[] array1 = new int[3];

        Random random = new Random();
        int i = random.nextInt(10);
        int j = random.nextInt(20);
        int k = random.nextInt(54);

        array1[0] = i;
        array1[1] = j;
        array1[2] = k;

        System.out.println("array1 = { " + array1[0] + ", " + array1[1] + ", " + array1[2] + " }" + "\n");

        //4 elementner@ randomov
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();

        int q;
        int[] array2;
        int sum1 = 0;
        int mult1 = 1;

        System.out.print("Enter numbers of array: ");
        q = scanner.nextInt();
        array2 = new int[q];
        for (int i1 = 0; i1 < q; i1++) {
            array2[i1] = random1.nextInt(100);
            //5
            sum1 += array2[i1];
            mult1 *= array2[i1];
            System.out.println("Enter a[" + i1 + "]=" + array2[i1]);
        }
        System.out.println();
        System.out.println("sum1 = " + sum1);
        System.out.println("mult1 = " + mult1);
        System.out.println();

        //4 elementner@ scannerov//Gosha
        Scanner in = new Scanner(System.in);
        int n;
        int[] ar;

        System.out.println("Enter numbers of array");
        n = in.nextInt();
        ar = new int[n];

        for (int p = 0; p < n; p++) {
            ar[p] = in.nextInt();
            System.out.println("Enter a[" + p + "] = " + ar[p]);
        }

        //6
        Scanner scanner1 = new Scanner(System.in);

        String str = "Name: ";
        String str1 = scanner1.nextLine();
        System.out.println(str + str1);

        String str2 = "LastName: ";
        String str3 = scanner1.nextLine();
        System.out.println(str2 + str3);

        String str4 = "Age: ";
        int i1 = scanner1.nextInt();
        System.out.println(str4 + i1);
        System.out.println();

        //7
        Scanner scanner2 = new Scanner(System.in);

        long l1 = scanner2.nextLong();
        System.out.println("l1 = " + l1);

        long l2 = scanner2.nextLong();
        System.out.println("l2 = " + l2);

        long sum = l1 + l2;
        long mult = l1 * l2;

        System.out.println("Sum is: " + sum);
        System.out.println("Mult is: " + mult);
        System.out.println();

        //8
        char[] chars = new char[]{'s', '5', 'w', 'A', '4'};
        System.out.print("char is: ");
        for (int w = 0; w < chars.length; w++) {
            System.out.print(chars[w] + " ");
        }
        System.out.println("\n");

        //9
        Scanner scanner3 = new Scanner(System.in);
        double d1 = scanner3.nextDouble();
        System.out.println("d1 is: " + d1);
        double d2 = scanner3.nextDouble();
        System.out.println("d2 is: " + d2);

        if (d1 > d2) {
            System.out.println("d1 > d2");
        } else {
            System.out.println("d1 < d2");
        }
        System.out.println();

        //10
        int[] array4 = new int[]{12, 25, 14, 38, 84, 19};
        int max = array4[0];
        int min = array4[0];

        for (int m = 1; m < array4.length; m++) {
            if (max < array4[m]) {
                max = array4[m];
            }
            if (min > array4[m]) {
                min = array4[m];
            }
        }
        System.out.println("max is: " + max);
        System.out.println("min is: " + min);
    }
}
