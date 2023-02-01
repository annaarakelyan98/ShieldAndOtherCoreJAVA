package com.core_java.chapter_2_dt;

public class DataTypesExamples2 {
    public static void main(String[] args) {

        long ci;
        long im;
        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("B одной кубической миле содержится " + ci + " кубических дюймов");
        System.out.println();

        //Pythagorean theorem
        double x, y, z;
        x = 3;
        y = 4;
        z = Math.sqrt(x * x + y * y);
        System.out.println("Nerqnadziqi erkarutyun: " + z);
        System.out.println();

        //char type
        char ch;
        ch = 'X';
        System.out.println("ch-i tesq@: " + ch);
        ch++;
        System.out.println("ch-i tesq@ hima: " + ch);
        ch = 77;
        System.out.println("ch-i tesq@ hima: " + ch);
        System.out.println();

        //Anna
        char name = '@';
        name++;
        System.out.print(name);
        name = 78;
        System.out.print(name);
        System.out.print(name);
        name = 'A';
        System.out.println(name + "\n");

        //boolean type
        boolean b;
        b = false;
        System.out.println("b-n @ndunum e: " + b);

        b = true;
        System.out.println("b-n @ndunum e: " + b);
        if (b) {
            System.out.println("Pahanj@ katarvum e!");
        }

        b = false;
        if (b) {
            System.out.println("Phanj@ chi katavum!");
        }

        System.out.println("6<10 artahaytutyun@: " + (6 < 10));
        System.out.println();
        //
        int hes = 0b11001;//2-akan
        int cov = 23_33_45;//underscore
        int dez = 0XFFA;//16-akan
        int cez = 077;//8-akan
        System.out.println(hes + "-2-akan! " + cov + "-underscore! " + dez + "-16-akan! " + cez + "-8-akan! ");
        System.out.println();

        //literals
        System.out.println("Ays tox@ \n    kisvum e!");
        System.out.println("A\tB\tC\nL\tM\tN");
        System.out.println();

        //area of the circle
        double radius = 5, arrey;
        arrey = 3.14 * radius * radius;
        System.out.println("Shrjani makeres@: " + arrey);
    }
}
