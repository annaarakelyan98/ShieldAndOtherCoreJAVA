package com.core_java.chapter_6_7;

//peregruzka methodov
class Peregruzka {
    void meth() {
        System.out.println("Datark");
    }

    void meth(int a) {
        System.out.println("1 popoxakan: " + a);
    }

    int meth(int a, int b) {
        System.out.println("2 int popoxakan: " + a + ", " + b);
        return a + b;
    }

    double meth(double a, double b) {
        System.out.println("2 double popoxakan: " + a + ", " + b);
        return a + b;
    }
}

public class OverloadMethods {
    public static void main(String[] args) {
        Peregruzka ob = new Peregruzka();
        int resI;
        double resD;
        byte b = 3;

        ob.meth();
        System.out.println();

        ob.meth(5);
        System.out.println();

        //avtomat kerpov byte, short
        //darnum en int
        //float` double
        resI = ob.meth(b, 5);
        System.out.println("Sum is: " + resI + "\n");

        resD = ob.meth(2.1, 5.3);
        System.out.println("Sum is: " + resD);
    }
}
