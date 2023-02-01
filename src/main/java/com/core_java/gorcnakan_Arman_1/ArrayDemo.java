package com.core_java.gorcnakan_Arman_1;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int[] arr;
        int n;

        System.out.print("Count: ");
        n = num.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = num.nextInt();
        }

        Array array = new Array(arr);

        System.out.println("Odd numbers count: " + array.oddCount());

        System.out.println("Even numbers sum: " + array.evenSum());

        System.out.println("Mutiplication > 0: " + array.mult());

        System.out.println("Minimum is: " + array.minimum());

        System.out.println("Maximum is: " + array.maximum());

        int[] a = array.print();

        System.out.println();

        int[] ar = array.sorting();
    }
}
