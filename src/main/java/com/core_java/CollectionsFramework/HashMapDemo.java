package com.core_java.CollectionsFramework;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //hajorakanutyun chka key
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("John", new Double(25.4));
        hm.put("Ann", new Double(51.6));
        hm.put("Mary", new Double(1256.8));
        hm.put("Jane", new Double(3343.34));
        hm.put("Joan", new Double(856.78));

        //entrySet() methodov stanum en bazmutyun
        //vor Set type uni, any element is object
        //Map.Entry
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        System.out.println("////////////");

        Double balance = hm.get("Ann");
        hm.put("Ann", balance + 1250);

        System.out.println("Ann's new: " + hm.get("Ann"));

        System.out.println("////////////");

        hm.remove("John");

        for (Map.Entry<String, Double> sd : set) {
            System.out.println(sd.getKey() + ": " + sd.getValue());
        }
    }
}
