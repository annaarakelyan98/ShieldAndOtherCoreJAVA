package com.core_java.homework5GorcnakanArman3;

public class Family {
    public String name;
    public String surename;
    public String homespace;
    int age;

    //empty constructor
    public Family() {
    }

    //
    public Family(int age){
        this.age = age;
    }

    //method
    public void HomeSpace(String home) {
        this.homespace = home;
        System.out.println("Home location: " + homespace);
    }

    //
    public void TelNum(String num) {
        System.out.println("Telephone number: " + num);
    }
}
