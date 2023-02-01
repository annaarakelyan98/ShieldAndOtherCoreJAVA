package com.core_java.chapter_4_class;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //1
        int degree = func(2, 6);
        System.out.println("2's 6th degree: " + degree);

        //2
        System.out.print("Array members are ");
        array();

        //3
        string();

        //4
        count();

    }

    //1
    public static int func(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    //2
    public static int[] array() {
        int[] array;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = in.nextInt();
        }
        return array;
    }

    //3
    public static void string() {
        String name = "Anna";
        String surname = "Arakelyan";
        System.out.println(name + " " + surname);
    }

    //4//return
    public static void count() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
    }
}
