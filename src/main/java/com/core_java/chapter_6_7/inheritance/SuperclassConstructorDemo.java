package com.core_java.chapter_6_7.inheritance;

class SuperClasses {
    private double width;
    private double height;

    SuperClasses(double w, double h) {
        width = w;
        height = h;
    }

    SuperClasses(double x) {
        width = height = x;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    /*void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }*/
}

class SubclassFirst extends SuperClasses {
    private String style;

    SubclassFirst(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    SubclassFirst(String s, double y) {
        super(y);
        style = s;
    }

    void showStyle() {
        System.out.println(style + " is rightAngle!");
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }
}

public class SuperclassConstructorDemo {
    public static void main(String[] args) {
        SubclassFirst t = new SubclassFirst("Triangle", 2.5, 5.8);
        SubclassFirst t1 = new SubclassFirst("My triangle", 5.8);

        t.showStyle();
        System.out.println("Triangle's area: " + t.area());

        System.out.println("/////////////////");

        System.out.println("Width " + t1.getWidth() + " and height " + t1.getHeight());
        t1.showStyle();
        System.out.println("Area: " + t1.area());
    }
}
