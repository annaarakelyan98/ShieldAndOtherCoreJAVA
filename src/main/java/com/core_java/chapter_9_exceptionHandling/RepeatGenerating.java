package com.core_java.chapter_9_exceptionHandling;

class RepeatThrow {
    static void method() {
        int[] array = {2, 3};
        System.out.println("Before generating!");
        array[3] = 5;
        System.out.println("None!");
    }

    public static void reThrow() {
        int[] num = {5, 2, 9, 3, 4, 10, 1};
        int[] num1 = {1, 2, 0, 3, 2};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + num1[i] +
                        " = " + num[i] / num1[i]);
            } catch (ArithmeticException a) {
                System.out.println("0 division exception!");
            } catch (ArrayIndexOutOfBoundsException ar) {
                System.out.println("Out of bounds exception!");
                throw ar;
            }
        }
    }
}

public class RepeatGenerating {
    public static void main(String[] args) {
        try {
            RepeatThrow.reThrow();
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Final exception!");
        }

        System.out.println();

        try {
            RepeatThrow.method();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("toString() exception");
            System.out.println(exception/*.toString()*/);

            System.out.println("\nPrintStackTrace() exception");
            exception.printStackTrace();
        }
        System.out.println("After catch instruction!");

    }
}
