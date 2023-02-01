package com.core_java.multythreading.threads.src.main.java.com.threads.demo;

//by extending Thread class
//using methods
// final boolean isAlive()-return true if a thread
// for what it is called is alive
//final void join() -throw InterruptedException
//waits for ending thread for what is is called
public class Threads {
    public static void main(String[] args) {
        MyThreads one = new MyThreads("One");
        MyThreads two = new MyThreads("Two");
        MyThreads three = new MyThreads("Three");

        System.out.println("Thread one starts: " + one.thread.isAlive());
        System.out.println("Thread two starts: " + two.thread.isAlive());
        System.out.println("Thread three starts: " + three.thread.isAlive());

        try {
            System.out.println("Main thread starts");
            for (int i = 5; i > 0; i--) {
                one.thread.join();
                two.thread.join();
                three.thread.join();
            }
        }catch (InterruptedException ec){
            System.out.println("Main thread has interrupted");
        }

        System.out.println(one.thread.isAlive());
        System.out.println(two.thread.isAlive());
        System.out.println(three.thread.isAlive());

        System.out.println("Main thread has ended");
    }
}
