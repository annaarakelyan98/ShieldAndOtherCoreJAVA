package com.core_java.chapter_4_class;

class EvenOdd {
    boolean isEven(int x) {
        return (x % 2) == 0;
    }
}

public class EvenDemo {
    public static void main(String[] args) {
        EvenOdd x = new EvenOdd();
        if (x.isEven(10)) {
            System.out.println("10 is even");
        }
        if (x.isEven(7)) {
            System.out.println("7 is odd//won't print");
        }
    }
}
