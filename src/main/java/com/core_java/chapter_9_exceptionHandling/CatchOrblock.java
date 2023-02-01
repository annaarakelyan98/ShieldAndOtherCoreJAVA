package com.core_java.chapter_9_exceptionHandling;

public class CatchOrblock {
    public static void main(String[] args) {
        int a = 2, b = 0;
        int result;
        char[] ch = {'A', 'B', 'C'};

        for (int i = 0; i < 4; i++) {
            try {
                if (i == 0) {
                    result = a / b;
                } else {
                    ch[5] = 'X';
                }
            } catch (/*final*/ ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception: " + e);
            }
        }
        System.out.println("Out of block try!");
    }
}
