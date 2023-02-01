package com.core_java.chapter_12_enumAutoboxingWrapper;

public class HandlingPackUnpack {
    public static void main(String[] args) {
        //handle packing
        Integer iOb = new Integer(100);
        //handle unpacking
        int i = iOb.intValue();

        System.out.println(iOb + " " + i);
    }
}
