package com.core_java.CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_LinkedHashSet {
    public static void main(String[] args) {
        //hajorakanutyun chka bazmutyan mej
        //unique members in set
        HashSet<String> hs = new HashSet<>();

        hs.add("1");
        hs.add("5");
        hs.add("3");
        hs.add("8");
        hs.add("8");
        hs.add("18");

        System.out.println(hs);

        //hajordakanutyun chka
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("5");
        lhs.add("3");
        lhs.add("1");

        System.out.println(lhs);
    }
}
