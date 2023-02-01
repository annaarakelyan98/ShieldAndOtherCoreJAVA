package com.core_java.chapter_6_7.inheritance;

class Square {
    private double width;
    private double height;

    Square(double w, double h) {
        width = w;
        height = h;
    }

    Square(double x) {
        width = height = x;
    }

    Square(Square ob){
        width = ob.width;
        height = ob.height;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }
}

class TrianglesInheritance extends Square {
    private String style;

    TrianglesInheritance(String s, double w, double h) {
        super(w, h);
        style = s;
    }

    TrianglesInheritance(String s, double y) {
        super(y);
        style = s;
    }

    TrianglesInheritance(TrianglesInheritance ob){
        super(ob);
        style = ob.style;
    }

    void showStyle() {
        System.out.println(style + " triangle!");
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }
}

public class SubclassCallSuperclassDemo {
    public static void main(String[] args) {
        TrianglesInheritance t1 = new TrianglesInheritance("Red",2.2,1.8);
        TrianglesInheritance t2 = new TrianglesInheritance(t1);

        t1.showStyle();
        System.out.println("Triangle's area: " + t1.area());

        System.out.println("/////////////////");

        System.out.println("Width " + t2.getWidth() + " and height " + t2.getHeight());
        t2.showStyle();
        System.out.println("Area: " + t2.area());
    }
}
