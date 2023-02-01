package com.core_java.generics;

class Summation {
    private int sum;

    <T extends Number> Summation(T ob) {
        sum = 0;

        for (int i = 0; i <= ob.intValue(); i++) {
            sum += i;
        }
    }

    int getSum() {
        return sum;
    }
}

public class GenericConstructor {
    public static void main(String[] args) {
        Summation ob = new Summation(5.5);

        System.out.println("Sum from 0 to 5: " + ob.getSum());
    }
}
