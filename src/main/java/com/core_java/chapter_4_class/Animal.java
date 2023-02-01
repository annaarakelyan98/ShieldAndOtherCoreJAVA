package com.core_java.chapter_4_class;

public class Animal {
    public int weight = 20;

    public int height;

    //constructor
    public Animal(int h, String n) {
        this.height = h;
        this.name = n;
    }

    //Empty constructor
    public Animal() {
    }

    public void name(String names) {
        System.out.println("Hello, " + names);
    }

    public void function(String func) {
        System.out.println("My function is: " + func);
    }

    public String name = "Ann";
}
