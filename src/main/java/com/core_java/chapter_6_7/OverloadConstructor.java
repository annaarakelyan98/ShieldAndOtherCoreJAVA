package com.core_java.chapter_6_7;

class Construct {
    int sum;

    Construct(int num) {
        sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
    }

    Construct(Construct ob) {
        sum = ob.sum;
    }
}

public class OverloadConstructor {
    public static void main(String[] args) {
        Construct construct = new Construct(5);
        Construct construct1 = new Construct(construct);

        System.out.println("Sum is: " + construct.sum);
        System.out.println("Sum is: " + construct1.sum);
    }
}