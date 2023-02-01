package com.core_java.chapter_2_dt;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args)
            throws java.io.IOException {
        System.out.println("Hello Java!");

        //data types
        int i = 12;
        int j = 2;

        int s, d, m, sub, mod;
        s = i + j;
        sub = i - j;
        d = i / j;
        m = i * j;
        mod = i % j;

        System.out.println("i and j: " + i + " " + j);
        System.out.println("s: " + s);
        System.out.println("sub: " + sub);
        System.out.println("d: " + d);
        System.out.println("m: " + m);
        System.out.println("mod: " + mod);

        //
        float a = 1.4f;
        double b = 2.5;

        double c = a + b;

        System.out.println("c = " + c);

        //
        char ch = 'h';
        char ch1 = '5';
        System.out.println("ch1: " + ch1);
        System.out.println("ch: " + ch);

        //
        if (5 != 4) {
            System.out.println("true");
        }

        //
        int l, n;
        l = 18;
        n = 5;
        if (l % n == 0) {
            System.out.println("l bajanvuma n");
        } else {
            System.out.println("chi bajanvum");
        }

        //loop
        int sum = 0;
        int arr[] = {13, 5, 5, 8};

        for (int p = 0; p < arr.length; p++) {
            sum = sum + arr[p];
        }
        System.out.println("sum is: " + sum);

        //
        boolean b1 = true;
        if (b1) {
            System.out.println("Is true!");
        }

        b1 = false;
        if (b1) {
            System.out.println("Chi tpelu!");
        }

        //String
        String str = "Hello Java!";
        System.out.println(str);

        //Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("My line is: " + scanner.nextLine());
        System.out.print("My number is: ");
        int i1 = scanner.nextInt();

        //System.in.read()
        int str1;
        System.out.print("Mutq enq anum symbol! ");
        str1 = System.in.read();

        //if-else
        Scanner num = new Scanner(System.in);
        int sod;
        sod = num.nextInt();
        if (sod <= 10) {
            System.out.println("System Of A Down!");
        } else if (sod == 115) {
            System.out.println("Big Time Rush!");
        } else {
            System.out.println("Abba");
        }

        //switch-case
        int w;

        for (w = 0; w < 5; w++) {
            switch (w) {
                case 0:
                    System.out.println("W is 0!");
                    break;
                case 1:
                    System.out.println("W is 1!");
                    break;
                case 2:
                    System.out.println("W is 2!");
                    break;
                case 3:
                    System.out.println("W is 3!");
                    break;
                default:
                    System.out.println("Other!");
                    break;
            }
        }
    }
}
