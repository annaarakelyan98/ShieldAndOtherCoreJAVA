package com.core_java.chapter_4_class;

public class Vehicle {
    int passengers;
    int fuelCap;
    int mpg;

    //1 method
    public void range() {
        System.out.println("Range equals to: " + fuelCap * mpg);
    }

    //2 method range
    public int range1() {
        return fuelCap * mpg;
    }

    //fuelNeed//Fuel's quantity
   public double fuelNeed(int miles) {
        return (double) miles / mpg;
    }
}
