package com.core_java.chapter_4_class;

public class Power {
    double b;
    int e;
    double val;

    public Power(double base, int exp) {
        this.b = base;
        this.e = exp;

        val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) {
            this.val *= base;
        }
    }

    public double getPower() {
        return this.val;
    }

    public static void main(String[] args) {
        Power pwr = new Power(5.0, 5);
        Power pwr1 = new Power(2.5, 6);

        System.out.println(pwr.b + " " + pwr.getPower());
        System.out.println(pwr1.b+" "+ pwr1.getPower());
    }
}
