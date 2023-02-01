package com.core_java.chapter_9_exceptionHandling;

class Finally {
    public static void useFinally(int what) {
        int t;
        int[] nums = new int[2];
        try {
            switch (what) {
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    nums[4] = 5;
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException arithmeticException) {
            System.out.println("0 division exception!");
            return;
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Index out of bounds!");
            return;
        } finally {
            System.out.println("Out from try block!");
        }
    }
}

public class FinallyBlock {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Finally.useFinally(i);
            System.out.println();
        }
    }
}
