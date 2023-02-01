package com.core_java.chapter_6_7;

class Static {
    int x;
    static int y;

    int sum() {
        return x + y;
    }

    //in static methods may be only
    //static members
    //called static methods
    //not link this
    static int val() {
        return y / 2;
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Static s1 = new Static();
        Static s2 = new Static();

        s1.x = 5;
        s2.x = 12;

        System.out.println("s1.x and s2.x: " + s1.x + " and " + s2.x);

        System.out.println();

        //y1
        Static.y = 25;

        System.out.println("s1.x + Static.y = " + s1.sum());
        System.out.println("s2.x + Static.y = " + s2.sum());

        System.out.println();

        //y2
        Static.y = 111;

        System.out.println("s1.x + Static.y = " + s1.sum());
        System.out.println("s2.x + Static.y = " + s2.sum());

        System.out.println();

        //static method
        System.out.println("y/2: " + Static.val());
    }
}
