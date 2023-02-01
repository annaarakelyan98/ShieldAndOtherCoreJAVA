package com.core_java.repitition;
//file-ic kardum enq nyut@

import java.io.*;

public class Capter10 {
    public static void main(String[] args) {
        int i;

        FileInputStream f = null;
        try {
            f = new FileInputStream("Hello.txt");

            do {
                i = f.read();
            } while (i != -1);

        } catch (FileNotFoundException exc) {
            System.out.println("File not found");
        } catch (IOException ec) {
            System.out.println("Exception");
        } finally {
            try {
                if (f != null) f.close();
                
            } catch (IOException exc) {
                System.out.println("IOException");
            }
        }


    }
}
