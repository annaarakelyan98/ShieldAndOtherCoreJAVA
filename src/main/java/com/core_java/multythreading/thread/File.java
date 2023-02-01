package com.core_java.multythreading.thread;

import java.io.*;

public class File {
    public static void main(String[] args) {

        //1st version
        /*
         int i;
        FileInputStream fis;

        if (args.length != 1) {
            System.out.println("Using:File file_name");
            return;
        }

        try {
            fis = new FileInputStream(args[0]);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not founded!");
            return;
        }

        try {
            do {
                i=fis.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        }catch (IOException ioException){
            System.out.println("Exception read");
        }

        try {
            fis.close();
        }catch (IOException ioException){
            System.out.println("Exception close");
        }*/

        //2nd version
        int i;
        FileInputStream f = null;

       /* if (args.length != 1) {
            System.out.println("File name");
            return;
        }*/

        try {
            f = new FileInputStream(Name.class.getName());
            do {
                i = f.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Input exception: " + exc);
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
            } catch (IOException exc) {
                System.out.println("Exception closing file");
            }
        }
    }
}
