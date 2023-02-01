package com.core_java.CollectionsFramework;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class TreeMapDemo {
    public static void main(String[] args) {
        /*
         * in LinkedHashMap class has added
         * method removeEldestEntry and all HashMap's
         * methods
         *
         * class has gotten members in order which
         * they put
         * */

        //in adding order about key(achman kargov)

        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("Amy", new Integer(25623));
        tm.put("Beni", new Integer(8523));
        tm.put("Jeni", new Integer(363));
        tm.put("Jane", new Integer(7589));
        tm.put("Ann", new Integer(22568));

        Set<Map.Entry<String, Integer>> me = tm.entrySet();

        for (Map.Entry<String, Integer> se : me) {
            System.out.println(se.getKey() + " & " + se.getValue());
        }

        //

        Integer name = tm.get("Amy");
        tm.put("Amy", name - 20000);
        System.out.println("\nAmy's new value: " + tm.get("Amy") + "\n");

        //

        tm.remove("Ann");
        for (Map.Entry<String, Integer> mt : me) {
            System.out.println(mt.getKey() + ": " + mt.getValue());
        }
    }
}
