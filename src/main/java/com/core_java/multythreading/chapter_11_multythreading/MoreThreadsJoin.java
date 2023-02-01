package com.core_java.multythreading.chapter_11_multythreading;

class Join implements Runnable {
    Thread thrd;

    Join(String name) {
        thrd = new Thread(this, name);
    }

    public static Join createStart(String n) {
        Join mem = new Join(n);
        mem.thrd.start();
        return mem;
    }

    @Override
    public void run() {
        System.out.println("Start of Join thread");

        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(100);
                System.out.println("In " + thrd.getName() + " count is " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println("InterruptedException");
        }

        System.out.println("Final of baby thread");
        System.out.println();
    }
}

public class MoreThreadsJoin {
    public static void main(String[] args) {
        System.out.println("Start of main thread");

        System.out.println();

        Join j1 = Join.createStart("First");
        Join j2 = Join.createStart("Second");
        Join j3 = Join.createStart("Third");

        try {
            j1.thrd.join();
            System.out.println("First child thread run");
            j2.thrd.join();
            System.out.println("Second child thread run");
            j3.thrd.join();
            System.out.println("Third child thread run");
        } catch (InterruptedException exc) {
            System.out.println("InterruptedException");
        }

        System.out.println("\nMain method is final");
    }
}
