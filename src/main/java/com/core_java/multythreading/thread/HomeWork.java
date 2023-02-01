package com.core_java.multythreading.thread;

import java.io.*;

class Person implements Serializable {
    String name;
    String surename;
    int age;

    Person(String n, String s, int a) {
        this.name = n;
        this.surename = s;
        this.age = a;
    }
}

public class HomeWork {
    public static void main(String[] args) {
        Person p1 = new Person("Ann", "Arakelyan", 22);
        Person p2 = new Person("Mher", "Arakeyan", 2);

        try {
            FileOutputStream f = new FileOutputStream("Hello.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(p1);
            o.writeObject(p2);

            o.close();
            f.close();

            FileInputStream f1 = new FileInputStream("Hello.txt");
            ObjectInputStream o1 = new ObjectInputStream(f1);

            Person pr1 = (Person) o1.readObject();
            Person pr2 = (Person) o1.readObject();

            System.out.println(pr1.name + " " + pr1.surename + ": " + pr1.age);
            System.out.println(pr2.name + " " + pr2.surename + ": " + pr2.age);

            o1.close();
            f1.close();

        } catch (FileNotFoundException exc) {
            System.out.println("File not found");
        } catch (IOException exc) {
            System.out.println("Error");
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        }
    }

}