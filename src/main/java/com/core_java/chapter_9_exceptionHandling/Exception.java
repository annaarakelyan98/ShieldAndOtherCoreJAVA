package com.core_java.chapter_9_exceptionHandling;

class Exc {
    public static void meth() {
        int[] ar = new int[2];
        ar[5] = 0;
        System.out.println("None");
    }

    public static void method(int what) {
        int[] num = new int[2];
        int t;

        try {
            System.out.println("stacanq: " + what);
            switch (what) {
                case 0:
                    t = 10 / what;
                    break;
                case 1:
                    num[5] = 5;
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException a) {
            System.out.println("0 division exception");
            return;
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Index out of bounds exception");
        } finally {
            System.out.println("After block catch");
        }
    }
}

public class Exception {
    public static void main(String[] args) {
        int[] array = new int[3];

        int[] num = {5, 8, 6, 3, 10};
        int[] nums = {1, 0, 2, 3};

        //try/catch
        try {
            array[4] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("final\n");

        //try/catch in method
        try {
            Exc.meth();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Exception");
        }
        System.out.println("meth() exception\n");

        //try/catch/catch
        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + nums[i] +
                        " = " + num[i] / nums[i]);
            } catch (ArithmeticException e) {
                System.out.println("0 division exception");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bounds exception");
            }
        }

        //try/catch with Throwable class
       /* for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + nums[i] +
                        " = " + num[i] / nums[i]);
            } catch (Throwable e) {
                System.out.println("Exception");
            }
        }*/

        System.out.println();

        //nested blocks try/catch
        //361 page
        int[] a = {8, 3, 10, 11};
        int[] arr = {2, 0, 5};

        try {
            for (int i = 0; i < a.length; i++) {
                try {
                    System.out.println(a[i] + " / " + arr[i] +
                            " = " + a[i] / arr[i]);
                } catch (ArithmeticException arithmeticException) {
                    System.out.println("O division exception");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("Index exception");
        }

        //throw qcel exception
        try {
            System.out.println("\nBefore throw exception");
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Generated throw exception: " + e);
        }
        System.out.println("After throw exception");

        System.out.println();

        //Throwable class-i method-ner
        try {
            Exc.meth();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("toString() exception");
            System.out.println(exception/*.toString()*/);

            System.out.println("\ngetLocalizedMessage() exception");
            System.out.println(exception.getLocalizedMessage());

            System.out.println("MY exception");
            exception.printStackTrace();
        }

        System.out.println();

        //block finally
        for (int i = 0; i < 3; i++) {
            Exc.method(i);
            System.out.println();
        }
    }
}
