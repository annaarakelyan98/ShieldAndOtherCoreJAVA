package com.core_java.multythreading.thread;

import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Persson implements Serializable {
    private String name;
    private int age;
    private String gender;

    Persson(String n, int a, String g) {
        name = n;
        age = a;
        gender = g;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender;
    }
}

public class CreateReadWriteTextFile {
    public static void main(String[] args) {
        Persson p1 = new Persson("Arman", 27, "male");
        Persson p2 = new Persson("Artur", 25, "male");

        try {
            File file = new File("Person.txt");
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f);

            o.writeObject(p1);
            o.writeObject(p2);

            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(file);
            ObjectInputStream oi = new ObjectInputStream(fi);

            Person pr1 = (Person) oi.readObject();
            Person pr2 = (Person) oi.readObject();

            System.out.println(pr1.toString());
            System.out.println(pr2.toString());

            oi.close();
            fi.close();

        } catch (FileNotFoundException exc) {
            System.out.println("File not founded");
        } catch (IOException exc) {
            System.out.println("Error");
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        }
    }
}
