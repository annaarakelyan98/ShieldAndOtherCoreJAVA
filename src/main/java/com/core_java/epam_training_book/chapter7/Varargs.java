package com.core_java.epam_training_book.chapter7;

public class Varargs {

    static void vaTest(int... v) {
        System.out.print("Number of arguments: " + v.length + "\tContents: ");

        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(2,4,5);
        vaTest();
        vaTest(5,12,8,7,3);
    }
}
