package com.core_java.multythreading.chapter_11_multythreading;

class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick ");

        state = "ticked";

        notify();

        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("Wait exception");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify();
            return;
        }

        System.out.println("Tock");

        state = "tocked";

        notify();

        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException exc) {
            System.out.println("wait exc");
        }
    }
}

class ThreadWN implements Runnable {
    Thread thrd;
    TickTock tt;

    ThreadWN(String name, TickTock tT) {
        thrd = new Thread(this, name);
        tt = tT;
    }

    public static ThreadWN createAndStart(String nam, TickTock ttob) {
        ThreadWN tob = new ThreadWN(nam, ttob);
        tob.thrd.start();
        return tob;
    }

    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) tt.tick(true);
            tt.tick(false);
        } else {
            for (int i = 0; i < 5; i++) tt.tock(true);
            tt.tock(false);
        }
    }
}

public class WaitAndNotifyMethods {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        ThreadWN t1 = ThreadWN.createAndStart("Tick", tt);
        ThreadWN t2 = ThreadWN.createAndStart("Tock", tt);

        try {
            t1.thrd.join();
            t2.thrd.join();
        }catch (InterruptedException exc){
            System.out.println("Interrupted eception of main");
        }

    }
}
