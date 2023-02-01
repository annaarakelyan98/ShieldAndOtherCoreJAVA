package com.core_java.chapter_2_dt;

public class DataTypeExamples1 {
    public static void main(String[] args) {
        System.out.println("java правит Интернетом!");
        System.out.println();
        //data types

        //int
        int var1 = 102;
        int var2;
        System.out.println("var1 value is" + var1);
        var2 = var1 / 3;
        System.out.println("var2 value is var1 / 3 = " + var2);
        System.out.println();

        //double
        int var;
        double x;
        var = 10;
        x = 10.0;
        System.out.println("var's first value is: " + var);
        System.out.println("X's first value is: " + x);
        var = var / 4;
        x = x / 4;
        System.out.println("var/4=" + var + " and " + "x/4=" + x);
        System.out.println();

        //if
        if (3 < 5) System.out.println("3 < 5: true");
        if (3 > 5) System.out.println("Nothing");
        System.out.println();

        //
        int a, b, c;
        a = 3;
        b = 5;
        if (a == b) System.out.println("Error");
        if (a < b) System.out.println("a less than b");
        c = a - b;
        System.out.println("c = " + c);
        if (c >= 0) System.out.println("c is none negative");
        if (c < 0) System.out.println("c is negative");
        System.out.println();
        c = b - a;
        System.out.println("c = " + c);
        if (c >= 0) System.out.println("c is none negative");
        if (c < 0) System.out.println("c is negative");
        System.out.println();
        //for
        int i;
        for (i = 0; i < 7; i++) {
            System.out.println(i);
        }

        System.out.println("Finale!");
        System.out.println();
        //block
        double l, f, k;
        l = 4;
        f = 12;
        if (l != 0) {
            System.out.println("l isn't null");
            k = f / l;
            System.out.println("f / l = " + k);
        }
    }
}
