package com.core_java.chapter_6_7;

//peregruzka constructorov
class PerConst {
    int x;

    PerConst() {
        System.out.println("PerConst mej!");
        x = 0;
    }

    PerConst(int i) {
        System.out.println("Perconst(int) mej");
        x = i;
    }

    PerConst(double d) {
        System.out.println("Perconst(double) mej");
        x = (int) d;
    }

    PerConst(int i, int j) {
        System.out.println("Perconst(int, int) mej");
        x = i * j;
    }
}

public class PerConstructor {
    public static void main(String[] args) {
        PerConst ob1 = new PerConst();
        PerConst ob2 = new PerConst(5);
        PerConst ob3 = new PerConst(24.5);
        PerConst ob4 = new PerConst(8, 9);

        System.out.println("x = (datrak) " + ob1.x);
        System.out.println("x = (int) " + ob2.x);
        System.out.println("x = (double to int) " + ob3.x);
        System.out.println("x = (int * int) " + ob4.x);
    }
}
