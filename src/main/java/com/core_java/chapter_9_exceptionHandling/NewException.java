package com.core_java.chapter_9_exceptionHandling;

import java.lang.Exception;

class NonIntResult extends Exception {
    int i;
    int j;

    NonIntResult(int a, int b) {
        i = a;
        j = b;
    }

    public String toString() {
        return "Result of " + i + " / " + j + " not an integer";
    }
}

public class NewException {
    public static void main(String[] args) {
        int[] num = {5, 6, 8, 20};
        int[] den = {2, 0, 4};

        for (int i = 0; i < num.length; i++) {
            try {
                if (num[i] % 2 != 0) {
                    throw new NonIntResult(num[i], den[i]);
                }
                System.out.println(num[i] + " / " + den[i] + " = " + num[i] / den[i]);
            } catch (ArithmeticException a) {
                System.out.println("0 div");
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("out of bounds");
            } catch (NonIntResult a) {
                System.out.println(a);
            }
        }
    }
}
