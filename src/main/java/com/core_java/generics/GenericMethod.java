package com.core_java.generics;

public class GenericMethod {

    static <T extends Comparable<T>, V extends T> boolean arrayEquals(T[] x, V[] y) {
        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++)
            if (!x[i].equals(y[i])) return false;

        return true;
    }

    public static void main(String[] args) {
        Integer[] i1 = {1,2,3,4,5};
        Integer[] i2 = {1,2,3,4,5};
        Integer[] i3 = {1,3,5,7,4};
        Integer[] i4 = {1,2,3,4,5,6};

        if (arrayEquals(i1,i1))
            System.out.println("Hamarjeq en");
        else System.out.println("Hamarjeq chen");

        if (arrayEquals(i1,i2))
            System.out.println("Hamarjeq en");
        else System.out.println("Hamarjeq chen");

        if (arrayEquals(i1,i3))
            System.out.println("Hamarjeq en");
        else System.out.println("Hamarjeq chen");

        if (arrayEquals(i1,i4))
            System.out.println("Hamarjeq en");
        else System.out.println("Hamarjeq chen");
    }
}
