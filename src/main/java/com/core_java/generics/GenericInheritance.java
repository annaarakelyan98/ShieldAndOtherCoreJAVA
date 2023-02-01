package com.core_java.generics;

class GenIn<T extends Number> {
    T ob;

    GenIn(T obj) {
        this.ob = obj;
    }

    //kotarak@ shur tal
    double reciprocal() {
        return 1 / ob.doubleValue();
    }

    //veradarcnum e kotorakayin mas@
    double fraction() {
        return ob.doubleValue() - ob.intValue();
    }
}

class GenInh<A, B extends A> {
    A s;
    B c;

    GenInh(A su, B cu) {
        this.s = su;
        this.c = cu;
    }

    void show() {
        System.out.println("Members are: " + s + " and " + c);
    }
}

public class GenericInheritance {
    public static void main(String[] args) {
        GenIn<Integer> genIn = new GenIn<>(25);

        System.out.println("Number is int: " + genIn.ob);
        System.out.println("Kotorakayin mas: " + genIn.fraction());
        System.out.println("Shur tvac: " + genIn.reciprocal());

        System.out.println();

        GenIn<Double> genDouble = new GenIn<>(2.5);

        System.out.println("Number is double: " + genDouble.ob);
        System.out.println("Kotorakayin mas: " + genDouble.fraction());
        System.out.println("Shur tvac: " + genDouble.reciprocal());

        System.out.println();

        GenInh<Integer, Integer> ne = new GenInh<>(2, 5);

        ne.show();
        System.out.println("Sum of integers: " + (ne.s + ne.c));
    }
}
