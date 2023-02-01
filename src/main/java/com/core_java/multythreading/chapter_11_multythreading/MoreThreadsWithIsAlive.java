package com.core_java.multythreading.chapter_11_multythreading;

class More implements Runnable {
    Thread thrd;

    More(String name) {
        thrd = new Thread(this, name);
    }

    //factory method
    public static More createAndStart(String nam) {
        More thdr1 = new More(nam);
        thdr1.thrd.start();
        return thdr1;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " - start");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(100);
                System.out.println("In " + thrd.getName() + " count is " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println("Interrupted exception");
        }
        System.out.println("Final of baby threads");
    }
}

public class MoreThreadsWithIsAlive {
    public static void main(String[] args) {
        More more = More.createAndStart("First");
        More more1 = More.createAndStart("Second");
        More more2 = More.createAndStart("Third");

        do {
            System.out.println(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("INTERRUPTED EXCEPTION");
            }
        } while (more.thrd.isAlive() || more1.thrd.isAlive() || more2.thrd.isAlive());

        System.out.println("final of main thread");
    }
}
