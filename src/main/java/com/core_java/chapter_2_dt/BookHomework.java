package com.core_java.chapter_2_dt;

public class BookHomework {
    public static void main(String[] args) {

        //1.1
        double gallons;
        double liters;
        gallons = 10;
        liters = gallons * 3.7854;
        System.out.println(gallons + " gallons match " + liters + " liter");
        System.out.println();

        //1.2
        double gall, lit;
        int count = 0;
        for (gall = 1; gall <= 100; gall++) {
            lit = gall * 3.7854;
            System.out.println(lit);
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();

        //exercise 1
        double erk, lus;
        erk = 58;
        System.out.println("Weight on the Earth: " + erk);
        lus = (erk * 17) / 100;
        System.out.println("Weight on the Moon: " + lus);
        System.out.println();

        //2.1
        double dist;
        dist = 1100 * 7.2;
        System.out.println("Distance is: " + dist);
        System.out.println();

        //exercise 2
        int tiv, baj, sum;
        sum = 0;
        for (tiv = 1; tiv <= 20; tiv++) {
            baj = tiv % 3;
            if (baj == 0) {
                System.out.println("3-i bazmapatik e: " + tiv);
                sum += tiv;
            }
        }
        System.out.println("sum@: " + sum);
    }
}
