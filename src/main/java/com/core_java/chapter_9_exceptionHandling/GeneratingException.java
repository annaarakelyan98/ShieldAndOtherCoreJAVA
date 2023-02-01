package com.core_java.chapter_9_exceptionHandling;

public class GeneratingException {
    public static void main(String[] args) {
        try {
            System.out.println("Generating exception by hand!");
            throw new ArithmeticException();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("My exception is generated!");
        }
    }
}
