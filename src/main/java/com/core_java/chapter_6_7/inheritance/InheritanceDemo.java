package com.core_java.chapter_6_7.inheritance;

class PolygonsInheritance {

    double width;
    double height;

    void showDim() {
        System.out.println("width and height: " + width + " and " + height);
    }
}

class TriAngles extends PolygonsInheritance {
    //Triangle
    String style;

    double area() {
        return (width * height) / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}

//Rectangle
class Rectangle extends PolygonsInheritance {
    boolean isSquare() {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }

    double area() {
        return width * height;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        TriAngles t1 = new TriAngles();
        TriAngles t2 = new TriAngles();
        Rectangle r1 = new Rectangle();

        System.out.println("1st triangle");
        t1.width = 5.0;
        t1.height = 5.0;
        t1.style = "has 3 angles!";
        t1.showStyle();
        t1.showDim();
        System.out.println("Area: " + t1.area());

        System.out.println("\n2nd triangle");

        t2.width = 2.6;
        t2.height = 3.8;
        t2.style = "beautiful";
        t2.showStyle();
        t2.showDim();
        System.out.println("Area: " + t2.area() + "\n");

        System.out.println("Rectangle");
        r1.width = 5.0;
        r1.height = 5.0;

        System.out.println("Square! " + r1.isSquare());
        System.out.println("Area: " + r1.area());
    }
}