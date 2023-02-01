package com.core_java.chapter_9_exceptionHandling;

public class NestedTryBlocks {
    public static void main(String[] args) {
        int[] array1 = {50, 20, 25, 3, 8, 15, 28, 6};
        int[] array2 = {5, 10, 5, 0, 0, 5};

        try {
            for (int i = 0; i < array1.length; i++) {
                try {
                    System.out.println(array1[i] + " / " + array2[i] +
                            " = " + array1[i] / array2[i]);
                } catch (ArithmeticException arithmeticException) {
                    System.out.println("0 division exception!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Index out of bounds!");
        }
    }
}
