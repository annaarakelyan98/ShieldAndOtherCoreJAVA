package com.core_java.chapter_9_exceptionHandling;

/*
            * Exception super class and baby class
            super class Throwable must be
            *  after baby class...
            * super class is Throwable
            * catch(baby_class bc){
            * ......
            * }catch(Throwable th){
            * ...exception members
            * }
            * */

class ExcTest {
    static void meth() {
        int nums[] = new int[4];
        try {
            System.out.println("Before generation!");
            nums[5] = 0;
            System.out.println("None!");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Hello");
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5];

        int[] arr1 = {6, 3, 4, 8, 10, 9, 11, 15};
        int[] arr2 = {2, 0, 4, 2, 0, 3};

        for (int i = 0; i < arr1.length; i++) {
            try {
                System.out.println(arr1[i] + " / " + arr2[i]
                        + " = " + arr1[i] / arr2[i]);
            } catch (ArithmeticException arithmeticException) {
                System.out.println("0 division error!");
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println("Out of bounds exception!");
            }
        }

        System.out.println();

        try {
            System.out.println("Exception handling!");
            arr[0] = 10;
            System.out.println("Error");
            arr[6] = 12;
            System.out.println("Error 2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        }

        System.out.println();

       /* try {
            ExcTest.meth();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of bounds!");
        }*/

        ExcTest.meth();
    }
}
