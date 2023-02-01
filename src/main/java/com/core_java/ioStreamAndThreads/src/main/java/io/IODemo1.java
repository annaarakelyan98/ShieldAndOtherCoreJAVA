package com.core_java.ioStreamAndThreads.src.main.java.io;

import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\n";
    }
}

public class IODemo1 {
    public static void main(String[] args) throws Throwable{
        Person p1 = new Person("Arman", 27);
        Person p2 = new Person("Anna", 22);

            File file = new File("Hello.txt");
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(p1);
            o.writeObject(p2);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream ob = new ObjectInputStream(fi);

            Person person1 = (Person) ob.readObject();
            Person person2 = (Person) ob.readObject();

            System.out.println(person1.toString());
            System.out.println(person2.toString());

            ob.close();
            fi.close();
    }
}



