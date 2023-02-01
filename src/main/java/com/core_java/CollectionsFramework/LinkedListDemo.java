package com.core_java.CollectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        //add
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("I");
        linkedList.add("F");

        System.out.println("LinkedList before: " + linkedList);

        //add first and last
        linkedList.addFirst("A");
        linkedList.addLast("G");

        System.out.println("After: " + linkedList);

        //add index and element
        linkedList.add(7, "H");

        System.out.println(linkedList);

        //remove
        linkedList.remove("B");
        linkedList.remove(5);
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("Removing elements by 4 methods: " + linkedList);

        //get and set
        String nam = new String("Ann");
        String var = linkedList.get(2);
        linkedList.set(2, var + " changed to " + nam);
        System.out.println("get & set: " + linkedList);

        String n = linkedList.get(3);
        System.out.println(n);
    }
}
