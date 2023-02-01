package com.core_java.static_block_example;

public class Car {

    static {
        System.out.println("non static block");
    }

    {
        System.out.println("static block");
    }

    public static String type = "CAR";
    public String name;

    public Car(String name) {
        this.name = name;
    }

    static void a_static() {
        System.out.println("'a_static'");
    }

    void b_non_static() {
        System.out.println("b_non_static");
    }
}
