package com.core_java.gorcnakan_Arman_1;

public class Capter7 {
    int width;
    int height;

    private int weight;

    Capter7() {
    }

    Capter7(int w) {
        weight = w;
    }

    void setWeight(int w) {
        weight = w;
    }

    int getWeight() {
        return weight;
    }

    void show() {
        System.out.println("width and height: " + width + " & " + height);
    }
}

class Triangle3 extends Capter7 {
    String style;

    int width;

    private String colour;

    Triangle3() {
    }

    Triangle3(int weigh, String c) {
        super(weigh);
        colour = c;
    }

    Triangle3(int widt,int wid){
        super.width = widt;
        width = wid;
    }

    int array() {
        return width * height / 2;
    }

    void showStyle() {
        System.out.println("Triangle is: " + style);
    }

    void showColour() {
        System.out.println("Colour is: " + colour);
    }
}
