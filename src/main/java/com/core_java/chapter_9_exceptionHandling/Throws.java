package com.core_java.chapter_9_exceptionHandling;

import java.io.IOException;
import java.lang.ArithmeticException;

class ThrExc {
    public static char thrExc(String str) throws IOException {
        System.out.print(str + ": ");

        return (char) System.in.read();
    }
}

public class Throws {
    public static void main(String[] args) throws ArithmeticException {
        char ch;

        try {
            ch = ThrExc.thrExc("Letter");
        } catch (IOException io) {
            ch = 'K';
            System.out.println("system.out and system.in exception");
        }
        System.out.println("Let keyboard: " + ch);

        //
        int i = 8;
        try {
            System.out.println(i / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("0 div exception: " + arithmeticException);
        }


    }
}
