package com.core_java.multythreading.chapter_11_multythreading;

class Priority implements Runnable {
    Thread thread;
    int count;

    static boolean stop = false;
    static String currentName;

    //
    Priority(String n) {
        thread = new Thread(this, n);
        count = 0;
        currentName = n;
    }

    @Override
    public void run() {
        System.out.println("Start of " + thread.getName());
        do {
            count++;
            if (currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println("In " + currentName);
            }
        } while (stop == false && count < 10000000);
        stop = true;

        System.out.println(thread.getName() + " interruption");
    }
}

public class PriorityInThreads {
    public static void main(String[] args) {
        Priority mt1 = new Priority("Norm +");
        Priority mt2 = new Priority("Norm -");
        Priority mt3 = new Priority("Norm");
        Priority mt4 = new Priority("Norm");
        Priority mt5 = new Priority("Norm");

        mt1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thread.setPriority(Thread.NORM_PRIORITY - 2);

        mt1.thread.start();
        mt2.thread.start();
        mt3.thread.start();
        mt4.thread.start();
        mt5.thread.start();

        try {
            mt1.thread.join();
            mt2.thread.join();
            mt3.thread.join();
            mt4.thread.join();
            mt5.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Interrupted exception");
        }

        System.out.println(mt1.count + " is min priority");
        System.out.println(mt2.count + "is max priority");
        System.out.println(mt3.count + " is norm priority");
        System.out.println(mt4.count + " is norm priority");
        System.out.println(mt5.count + " is norm priority");
    }
}
