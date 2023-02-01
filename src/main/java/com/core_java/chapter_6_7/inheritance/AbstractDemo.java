package com.core_java.chapter_6_7.inheritance;
/*
* abstract class hasn't objects
*
* abstract method hasn't body
*
* abstract class's abstract methods should be overridden
* into every inherited class
*
* into abstract class we can override
* only abstract methods
* */

//abstract class
abstract class Polygon {
    double width, height;
    String name;

    Polygon(double a, double b, String n) {
        width = a;
        height = b;
        name = n;
    }

    Polygon(double x, String s){
        width = height = x;
        name = s;
    }

    //abstract method
    abstract double area();
}

class Triangles extends Polygon {
    String style;

    Triangles(double w, double h, String s) {
        super(w, h, "triangle");
        style = s;
    }

    @Override
    double area() {
        return width * height / 2;
    }
}

class Rectangles extends Polygon {

    Rectangles(double w) {
        super(w, "rectangle");
    }

    @Override
    double area() {
        return width * height;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
    }
}
