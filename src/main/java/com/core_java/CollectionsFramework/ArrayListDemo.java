package com.core_java.CollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //1// add and remove methods practice
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Initial size of al: " + al.size() + "\n");

        al.add("Ann");
        al.add("Arman");
        al.add("Artur");

        System.out.println("Size: " + al.size());
        System.out.println(al);

        al.remove(2);
        al.remove("Ann");

        System.out.println("\n" + al);
        System.out.println("Size: " + al.size());

        //2//ArrayList to Array
        ArrayList<Integer> ai = new ArrayList<>();

        ai.add(5);
        ai.add(3);
        ai.add(2);
        ai.add(8);
        ai.add(0);

        System.out.println("ai list: " + ai);

        Integer[] ar = new Integer[ai.size()];
        ar = ai.toArray(ar);

        int sum = 0;
        for (int i : ai) {
            sum += i;
        }

        System.out.println("Sum is: " + sum);

        //for each
        ArrayList<Integer> in = new ArrayList<>();

        in.add(1);
        in.add(3);
        in.add(5);
        in.add(7);
        in.add(9);

        for (int v : in) {
            System.out.print(v + " ");
        }

        System.out.println();

        int sum1 = 0;
        for (int i : in) {
            sum1 += i;
        }
        System.out.println("Sum is: " + sum1);
    }
}
