package com.core_java.CollectionsFramework;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<>();

        //push~add
        adq.push("Ann");
        adq.push("Hello");
        adq.push("Java");

        System.out.println(adq);

        //get last member
        //peek method has returned head element and
        //has not deleted it
        System.out.println(adq.peekLast());

        //poll() and pop() has returned first element
        //and has deleted it
        //BUT
        //poll return null, if no such member in queue
        //pop NoSuchElementException()-a qcum
        adq.poll();
        /*System.out.println(adq.pop());
        adq.pop();*/
       try {
           System.out.println(adq.pop());
       }catch (NoSuchElementException ec){
           System.out.println("Hello");
       }


        ArrayDeque<Integer> ai = new ArrayDeque<>();

        ai.add(2);
        ai.add(3);
        ai.add(8);
        ai.add(4);

        System.out.println(ai);

        while (ai.peek() != null) {
            System.out.println(ai.pop());

        }
    }
}
