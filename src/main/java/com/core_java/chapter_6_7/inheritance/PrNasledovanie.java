package com.core_java.chapter_6_7.inheritance;

//private popoxakanner

class TwoDShape {
    private double width;
    private double height;

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double h) {
        height = h;
    }

    void setWidth(double w) {
        width = w;
    }

    void showDim() {
        System.out.println("Width and height: " + width + " and " + height);
    }
}

class Triangle extends TwoDShape {
    String style;

    double area() {
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

public class PrNasledovanie {
    public static void main(String[] args) {
        //super classi objecti hamar karox
        //enq kanchel miayn super classi
        // methodner,podclassic chenq karox
        System.out.println("1st triangle");
        TwoDShape ob = new TwoDShape();

        ob.setWidth(5.2);
        ob.setHeight(2.6);
        ob.showDim();

        //
        System.out.println("\n2nd triangle");
        Triangle ob1 = new Triangle();

        ob1.setHeight(2.7);
        ob1.setWidth(5.1);
        ob1.style = " so beautifull!";

        ob1.showDim();
        ob1.showStyle();
        System.out.println("Area: " + ob1.area());
    }
}
