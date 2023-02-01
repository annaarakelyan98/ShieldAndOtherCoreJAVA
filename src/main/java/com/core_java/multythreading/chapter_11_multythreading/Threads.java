package com.core_java.multythreading.chapter_11_multythreading;

class MyThread implements Runnable {
    String name;

    MyThread(String n) {
        this.name = n;
    }

    public void run() {
        System.out.println(name + " - start");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + name + ", count is: " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(name + " is interrupted");
        }
        System.out.println(name + " is over");
    }
}

class Threads {
    public static void main(String[] args) {
        System.out.println("Start main thread");

        MyThread mt = new MyThread("Hello");

        Thread mythread = new Thread(mt);
        mythread.start();

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException exc){
                System.out.println("interruption of main thread ");
            }
        }

        System.out.println("Final main thread");
    }
}
