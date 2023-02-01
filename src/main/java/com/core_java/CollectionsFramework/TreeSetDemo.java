package com.core_java.CollectionsFramework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //achman kargov
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(5);
        ts.add(3);
        ts.add(2);
        ts.add(4);
        ts.add(1);

        System.out.println(ts);

        System.out.println(ts.subSet(2,5));
    }
}
