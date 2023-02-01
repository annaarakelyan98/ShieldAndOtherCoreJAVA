package com.core_java.generics;

class GenInt<T> implements GenericInterface<T> {
    T[] array;

    GenInt(T[] ob) {
        this.array = ob;
    }

    public boolean contains(T o) {
        for (T x : array)
            if (x.equals(o)) return true;

            return false;
    }
}

public class GenInterface {
    public static void main(String[] args) {
        Integer x[] = {1,2,3};

        GenInt<Integer> obj = new GenInt<>(x);

        if (obj.contains(5)){
            System.out.println("obj contains 5");
        }else {
            System.out.println("not contains 5");
        }

        if (obj.contains(1)){
            System.out.println("obj contains 1");
        }else {
            System.out.println("not contains 1");
        }

        if (obj.contains(3)){
            System.out.println("obj contains 3");
        }else {
            System.out.println("not contains 3");
        }

        if (obj.contains(4)){
            System.out.println("obj contains 4");
        }else {
            System.out.println("not contains 4");
        }
    }
}
