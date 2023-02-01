package com.core_java.oldFiles;

//class constructor 1
class Boxx {
    double width;
    double height;
    double depth;
    Boxx() {

        width = 10;
        height = 10;
        depth = 10;
    }
    double volume() {
        return width * height * depth;
    }
}

//class 2 constructor
class Box5{
    double width;
    double height;
    double depth;
    Box5(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}

    public class ClassS {
    public static void main(String[] args) {
        Boxx mybox1 = new Boxx();
        Boxx mybox2 = new Boxx();
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);

        System.out.println("\n");

        // 2
        Box5 mybox3 = new Box5(10, 20, 15);
        Box5 mybox4 = new Box5(3, 6, 9);
        double vol1;
        vol1 = mybox3.volume();
        System.out.println("Volume is " + vol1);
        vol1 = mybox4.volume();
        System.out.println("Volume is " + vol1);


    }
}
