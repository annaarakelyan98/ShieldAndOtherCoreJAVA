package com.core_java.homework5GorcnakanArman3;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        //dinamic array
        int[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count of members: ");
        int n = scanner.nextInt();

        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            System.out.println("array[" + i + "] = " + array[i]);
        }

        System.out.println();

        Array array1 = new Array(array);
        //1 // kenteri qanak
        int count = array1.KentQan();
        System.out.println("Kenteri qanak: " + count);

        //2 // zuygeri gumar
        int sum = array1.ZuygGum();
        System.out.println("Zuygeri gumar: " + sum);

        //3 //0>eri artadryal
        int mult = array1.Artadryal();
        System.out.println("0-ic meceri artadryal: " + mult);

        //4 // min
        int min = array1.findMin();
        System.out.println("Min is: " + min);

        // 5 // max
        int max = array1.findMax();
        System.out.println("Max is: " + max);

        //6 // sorting
        /*int[] array2 = array1.arraySorting();*/
        array1.arraySorting();
    }
}
