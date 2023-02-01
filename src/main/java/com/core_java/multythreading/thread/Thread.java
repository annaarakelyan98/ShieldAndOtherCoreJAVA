package com.core_java.multythreading.thread;

import java.io.*;

class Name {
    public void name() {
        System.out.println("Ann");
    }
    private String name;
    public String getName(){
        return name;
    }
}

public class Thread {
    public static void main(String[] args)
            throws IOException {
        byte[] array = new byte[10];

        System.out.println("Write symbols.");
        System.in.read(array);
        System.out.print("write: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print((char) array[i]);
        }

        System.out.println();

        //PrintStream//OutputStream class
        int b;
        b = 'X';

        System.out.write(b);
        System.out.write('\n');
    }
}

