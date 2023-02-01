package com.core_java.oldFiles;

//class 1
class Box {
    double width;
    double height;
    double depth;
}

//class 2 volume
class Box1 {
    double width;
    double height;
    double depth;
    void volume() {
    System.out.print("Volume is ");
System.out.println(width * height * depth);
}
}

//class 3 return/square
class Box2 {
    double width;
    double height;
    double depth;
    double volume() {
        return width * height * depth;
    }
    int square(int i)
    {
        return i * i;
    }
}

//class 4
class Box3 {
    double width;
    double height;
    double depth;
    double volume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

    public class Class {
    public static void main(String[] args) {
        //1
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Volume is " + vol);

        System.out.println("\n");

        //2 volume
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume();

        System.out.println("\n");

        //3 return
        Box2 mybox3 = new Box2();
        Box2 mybox4 = new Box2();
        Box2 mybox5 = new Box2();
        double vol1;

        mybox3.width = 10;
        mybox3.height = 20;
        mybox3.depth = 15;

        mybox4.width = 3;
        mybox4.height = 6;
        mybox4.depth = 9;

        vol1 = mybox3.volume();
        System.out.println("Volume is " + vol1);
        vol1 = mybox4.volume();
        System.out.println("Volume is " + vol1);
        int x,y;
        x = mybox5.square(5);
        y = mybox5.square(8);
        System.out.println("x and y : " + x + ", " + y);

        System.out.println("\n");

        //4
        Box3 mybox6 = new Box3();
        Box3 mybox7 = new Box3();
        double vol2;

        mybox6.setDim(10, 20, 15);
        mybox7.setDim(3, 6, 9);

        vol2 = mybox6.volume();
        System.out.println("Volume is " + vol);

        vol = mybox7.volume();
        System.out.println("Volume is " + vol);

    }
}
