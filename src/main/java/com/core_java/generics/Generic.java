package com.core_java.generics;

class Gen<T> {
    T ob;

    Gen(T object) {
        this.ob = object;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T is: " + ob.getClass().getName());
    }
}

class GenTwo<T, V> {
    T ob1;
    V ob2;

    GenTwo(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    void showType1() {
        System.out.println("Type T is: " + ob1.getClass());
        System.out.println("Type V is: " + ob2.getClass().getName());
    }
}

public class Generic {
    public static void main(String[] args) {
        Gen<Integer> obj = new Gen<>(25);

        System.out.println("ob is: " + obj.getOb());
        obj.showType();

        Gen<String> str = new Gen<>("Ann");

        System.out.println("\nstr is: " + str.getOb());
        str.showType();

        System.out.println();

        GenTwo<Integer, String> twoOb = new GenTwo<>(22, "Ann");

        int i = twoOb.getOb1();
        System.out.println("Age is: " + i);

        String s = twoOb.getOb2();
        System.out.println("Name is: " + s);

        twoOb.showType1();
    }
}
