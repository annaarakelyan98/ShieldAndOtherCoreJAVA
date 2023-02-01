package com.core_java.generics;

public class Main {
    public static void main(String[] args) {
        Object object = new String("Hello World");
        String objectString = (String) object;

        System.out.println(objectString.substring(0,5));

        GenericTest <Integer>ob1 = new GenericTest<Integer>(1);

        System.out.println(ob1.object.getClass().getName());
    }
}

class GenericTest<A> {
    public A object;

    GenericTest(A obj) {
        this.object = obj;
    }

    GenericTest() {
    }
}
