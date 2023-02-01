package com.core_java.chapter_4_class;

public class Constructor {
    int x;
    int y;
    int passenger;
    int fuelCap;
    int mpg;

    public Constructor() {
        x = 10;
    }

    public Constructor(int i) {
        y = i;
    }

    //Car distance
    public Constructor(int p, int f, int m) {
        this.passenger = p;
        this.fuelCap = f;
        this.mpg = m;
    }

    //method
    public int range() {
        return fuelCap * mpg;
    }

    //method
    public double fuelNeeded(double miles) {
        return miles / mpg;
    }

    //this
}
