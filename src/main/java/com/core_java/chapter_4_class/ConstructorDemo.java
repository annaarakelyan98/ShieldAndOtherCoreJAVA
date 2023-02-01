package com.core_java.chapter_4_class;

public class ConstructorDemo {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        Constructor constructor1 = new Constructor();

        System.out.println(constructor.x + " and " + constructor1.x);

        //
        Constructor constructor2 = new Constructor(12);
        Constructor constructor3 = new Constructor(15);

        System.out.println(constructor2.y + " and " + constructor3.y);
        System.out.println();

        //Car
        Constructor car1 = new Constructor(5, 6, 8);
        Constructor car2 = new Constructor(18, 90, 5);

        System.out.println("Car1 goes " + car1.range() + " mile " + car1.fuelNeeded(48.0) + " by using liter.");
        System.out.println("Car1 goes " + car2.range() + " mile " + car1.fuelNeeded(450) + " by using liter.");
    }
}
