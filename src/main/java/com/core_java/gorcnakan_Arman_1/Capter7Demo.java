package com.core_java.gorcnakan_Arman_1;

public class Capter7Demo {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3();
        Triangle3 t2 = new Triangle3();

        Triangle3 t3 = new Triangle3(5, "red");

        //super classi memberner@ karox
        //en ogtagorcel miayn super classi methodner@
        //podclassi member@: super and podclassi
        Capter7 t4 = new Capter7();

        t1.width = 5;
        t1.height = 6;
        t1.style = "right angle";

        t2.width = 8;
        t2.height = 9;
        t2.style = "equilateral";

        t1.show();
        t1.setWeight(5);
        System.out.println("Weight is: " + t1.getWeight());
        System.out.println("t1 triangle's area: " + t1.array());
        t1.showStyle();

        System.out.println();

        t2.show();
        System.out.println("t2 triangle's area: " + t2.array());
        t2.showStyle();

        System.out.println();

        t3.showColour();
        System.out.println("t3 width is: " + t3.getWeight());

        System.out.println();

        t4.width = 4;
        t4.height = 8;

        System.out.println("t4 triangle");
        t4.show();
    }
}
