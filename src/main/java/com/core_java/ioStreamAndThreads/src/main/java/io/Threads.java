package com.core_java.ioStreamAndThreads.src.main.java.io;

import java.lang.*;

class MyThread implements Runnable {
    String name;
    int age;

    MyThread(String n, int a) {
        this.name = n;
        this.age = a;
    }

    @Override
    public void run() {
        System.out.println("name: " + name + "\nage: " + age);

        System.out.println("start: " + name);
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("in the process: " + name + " : " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println("final");
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread("Anna", 22);

        Thread thread = new Thread(myThread);

        thread.start();

        for (int i = 0; i < 50; i++){
            Thread.sleep(100);
        }

        System.out.println("final of main thread");
    }
}
