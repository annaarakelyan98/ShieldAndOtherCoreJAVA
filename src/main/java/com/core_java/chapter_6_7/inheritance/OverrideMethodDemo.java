package com.core_java.chapter_6_7.inheritance;

class SuperClass {
    int i, j;

    SuperClass(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class SubClass extends SuperClass {
    int ko;

    SubClass(int e, int f, int k) {
        super(e, f);
         ko = k;
    }

    void show() {
     /*   super.show();*/
        System.out.println("k: " + ko);
    }
}

public class OverrideMethodDemo {
    public static void main(String[] args) {
        SubClass e = new SubClass(5,6,3);

        e.show();
    }
}
