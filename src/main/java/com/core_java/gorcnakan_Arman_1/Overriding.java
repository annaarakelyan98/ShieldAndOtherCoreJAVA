package com.core_java.gorcnakan_Arman_1;

class TwoTheShape {
    private double width;
    private double height;
    private String name;

    //Overloading
    TwoTheShape() {
        width = height = 0.0;
        name = "none";
    }

    //[4]
    TwoTheShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoTheShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoTheShape(TwoTheShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

  /*  void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }*/

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and heigth: " + width + " and " + height);
    }

    //overriding
    double area() {
        System.out.println("Method area() is overriding!");
        return 0.0;
    }
}

class Triangle extends TwoTheShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    //[0]
    Triangle(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    //[3]
    Triangle(double x) {
        super(x, "triangle");
        style = "painted";
    }

    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    @Override
    double area() {
        return getHeight() * getWidth() / 2;
    }

    void setStyle(String s){
        style = s;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

class Rectangle extends TwoTheShape {
    Rectangle() {
        super();
    }

    //[2]
    Rectangle(double w, double h) {
        super(w, h, "rectangle");
    }

    //[1]
    Rectangle(double x) {
        super(x, "rectangle");
    }

    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        if (getHeight() == getWidth()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    double area() {
        return getHeight() * getWidth();
    }
}

public class Overriding {
    public static void main(String[] args) {
        TwoTheShape shapes[] = new TwoTheShape[5];
        TwoTheShape twoTheShape = new TwoTheShape(1.5,5.6,"red");
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle(triangle);
        //TwoTheShape twoTheShape1 = new Triangle(10);

        shapes[0] = new Triangle("contour", 8.2, 3.6);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(5, 8);
        shapes[3] = new Triangle(5.0);

        shapes[4] = new TwoTheShape(10, 20, "figure");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Object: " + shapes[i].getName());
            System.out.println("Area: " + shapes[i].area());
            System.out.println();
        }

        twoTheShape.showDim();
        triangle.setStyle("rightangle");
        triangle.showStyle();
    }
}
