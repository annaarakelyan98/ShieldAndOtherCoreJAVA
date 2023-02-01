package com.core_java.multythreading.threads.src.main.java.com.threads.demo;

public class MyThreads extends Thread {
    String name;
    Thread thread;

    MyThreads(String thrdName) {
        this.name = thrdName;
        thread = new Thread(this, name);
        System.out.println("New Thread: " + thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exc) {
            System.out.println(name + ": interrupted");
        }
        System.out.println(name + ": ended");
    }
}

