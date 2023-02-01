package com.core_java.chapter_4_class;

public class VehicleDemo {
    public static void main(String[] args) {
        //minivan
        System.out.println("Minivan");
        Vehicle minivan = new Vehicle();

        int range1;
        double gallons;

        minivan.passengers = 7;
        minivan.fuelCap = 16;
        minivan.mpg = 21;

        range1 = minivan.fuelCap * minivan.mpg;
        gallons = minivan.fuelNeed(252);

        System.out.println("gallons = " + gallons);
        System.out.println("Minivan has " + minivan.passengers + " passengers, and can move" + range1 + " mile!");

        //sportCar
        System.out.println("\nSportCar");
        Vehicle sportCar;
        sportCar = new Vehicle();

        int range2;
        sportCar.passengers = 2;
        sportCar.fuelCap = 14;
        sportCar.mpg = 12;

        range2 = sportCar.fuelCap * sportCar.mpg;

        System.out.println("SportCar has " + sportCar.passengers + "  passengers, and can move " + range2 + " mile!");

        //car1 & car2
        //car1@ & car2@ refer to object
        Vehicle car1 = new Vehicle();
        Vehicle car2;

        car2 = car1;
        car1.mpg = 26;
        System.out.println("\ncar1 = " + car1.mpg);
        System.out.println("car2 = " + car2.mpg);

        //car3, car4 and car5
        //car4 object changes
        Vehicle car3 = new Vehicle();
        Vehicle car4 = car3;
        Vehicle car5 = new Vehicle();
        car4 = car5;

        System.out.println();

        //opel
        System.out.println("Opel");
        Vehicle opel = new Vehicle();
        opel.fuelCap = 10;
        opel.mpg = 15;

        //1 method
        opel.range();

        //2 method
        range1 = opel.range1();
        System.out.println("Range1 is: " + range1 + "\n");

        //mercedes
        System.out.println("Mercedes");
        Vehicle mercedes = new Vehicle();
        mercedes.fuelCap = 20;
        mercedes.mpg = 50;
        int mercedesRange;
        mercedesRange = mercedes.range1();
        System.out.println("mercedesRange = " + mercedesRange);

        if (mercedes.range1() > opel.range1()) {
            System.out.println("Mercedes is faster");
        }
    }
}
