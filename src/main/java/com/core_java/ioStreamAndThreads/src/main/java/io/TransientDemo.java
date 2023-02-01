package com.core_java.ioStreamAndThreads.src.main.java.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientDemo implements Serializable {
    int id;
    String name;
    transient int age;//Now it will not be serialized

    public TransientDemo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class PersistExample {
    public static void main(String args[]) throws Exception {
        TransientDemo s1 = new TransientDemo(211, "ravi", 22);//creating object
        //writing object into file
        FileOutputStream f = new FileOutputStream("f.txt");
        ObjectOutputStream out = new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        f.close();
        System.out.println("success");
    }
}
