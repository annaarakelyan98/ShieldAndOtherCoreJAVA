package com.core_java.CollectionsFramework;

import java.util.*;

class People {
    private String name;
    private int age;

    People(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return getName();
    }
}


public class HashMap_TreeMap {
    public static void main(String[] args) {
        HashMap<People, Integer> hm = new HashMap<>();

        People ob1 = new People("Jane", 25);
        People ob2 = new People("Kate", 30);
        People ob3 = new People("Mike", 20);

        hm.put(ob1, ob1.getAge());
        hm.put(ob2, ob2.getAge());
        hm.put(ob3, ob3.getAge());

        System.out.println("Before sorting");

        Set<Map.Entry<People, Integer>> me = hm.entrySet();

        for (Map.Entry<People, Integer> m : me) {
            System.out.println(m.getValue() + " value and it's hash code " + m.hashCode());
        }

        System.out.println(hm.containsKey(ob1));
        System.out.println(me.equals(me));

        System.out.println(hm.toString());
    }
}
