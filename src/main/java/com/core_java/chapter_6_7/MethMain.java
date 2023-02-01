package com.core_java.chapter_6_7;

class Meth {
    //Methodin poxancum enq object

    int a, b, c;
    int volume;

    Meth(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    boolean sameBlock(Meth ob) {
        if (ob.a == a & ob.b == b & ob.c == c) {
            return true;
        } else {
            return false;
        }
    }

    boolean sameVolumn(Meth ob) {
        if (ob.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
}

public class MethMain {
    public static void main(String[] args) {
        Meth ob1 = new Meth(4,5,6);
        Meth ob2 = new Meth(4,5,6);
        Meth ob3 = new Meth(8,5,3);

        System.out.println("Nuyn blockic en: "+ ob1.sameBlock(ob2));
        System.out.println("Nuyn blockic en: "+ ob1.sameBlock(ob3));

        System.out.println("Same volume: "+ ob1.sameVolumn(ob3));
    }
}
