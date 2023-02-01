package com.core_java.chapter_6_7.inheritance;

class Polygons {
    private double width;
    private double height;

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }
}

class TriAngle extends Polygons {
    private String style;

    TriAngle(String s, double w, double h) {
        style = s;
        setWidth(w);
        setHeight(h);
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Style " + style);
    }
}

public class SetterInheritanceDemo {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle("RightAngle", 5.2, 6.8);

        t1.showStyle();
        System.out.println("Area: " + t1.area());
    }
}
