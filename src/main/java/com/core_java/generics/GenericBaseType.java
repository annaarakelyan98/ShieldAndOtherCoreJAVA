package com.core_java.generics;

class GenBase<T> {
    T ob;

    GenBase(T o) {
        this.ob = o;
    }

    T getOb() {
        return ob;
    }
}

public class GenericBaseType {
    public static void main(String[] args) {
        //Base type//argument of type
        GenBase genBase = new GenBase(new Double(5.5));

        double d = (Double) genBase.getOb();
        System.out.println("Arjeq: " + d);

        //Argument of type
        GenBase<Integer> genBase1 = new GenBase<>(5);
        System.out.println("Arjeq: " + genBase1.getOb());

        //Argument of type
        GenBase<String> genBase2 = new GenBase<>("Anna Arakelyan");
        System.out.println("Arjeq: " + genBase2.getOb());
    }
}
