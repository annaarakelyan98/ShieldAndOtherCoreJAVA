package com.core_java.CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String> itr = new ArrayList<>();

        itr.add("A");
        itr.add("B");
        itr.add("C");
        itr.add("D");
        itr.add("E");

        System.out.println(itr);

        Iterator<String> iterator = itr.iterator();

        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s + " ");
        }

        System.out.println("\n//");

        ListIterator<String> litr = itr.listIterator();

        while (litr.hasNext()) {
            String str = litr.next();
            litr.set(str + "+");
        }

        iterator = itr.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }

        System.out.println("\n//");

        while (litr.hasPrevious()){
            String st = litr.previous();
            System.out.print(st + " ");
        }
    }
}
