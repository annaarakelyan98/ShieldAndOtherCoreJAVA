package com.core_java.chapter_6_7.inheritance;

class Superclasses {
    private double width;
    private double height;

    Superclasses(double w, double h) {
        width = w;
        height = h;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void showDim() {
        System.out.println("Width and Height: " + width + " ev " + height);
    }
}

class FirstSubClass extends Superclasses {
    String style;

    FirstSubClass(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }
}

class SecondSubClass extends FirstSubClass {
    String color;

    SecondSubClass(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    void showColor() {
        System.out.println("Color: " + color);
    }
}

public class InheritanceDemoExample {
    public static void main(String[] args) {
        SecondSubClass t1 = new SecondSubClass("Red", " is equilateral!", 5.0, 4.3);
        SecondSubClass t2 = new SecondSubClass("Black", "is rightAngle", 3.8, 2.0);

        System.out.println("Triangle");
        t1.showDim();
        t1.showStyle();
        t1.showColor();
        System.out.println("Area: " + t1.area());

        System.out.println("\nTriangle");
        t2.showDim();
        t2.showStyle();
        t2.showColor();
        System.out.println("Area: " + t2.area());
    }
}
