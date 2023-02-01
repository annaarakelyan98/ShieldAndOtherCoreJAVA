package com.core_java.multythreading.chapter_11_multythreading;

class MyThread3 implements Runnable {
    Thread thrd;

    MyThread3(String name) {
        thrd = new Thread(this, name);
    }

    //factory method
    public static MyThread3 createAndStart(String name) {
        MyThread3 obj = new MyThread3(name);
        obj.thrd.start();
        return obj;
    }

    @Override//from Runnable interface
    public void run() {
        System.out.println(thrd.getName() + " - start");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " count is " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println("Interrupted exception");
        }
        System.out.println("Final");
    }
}

public class MyThread2 {
    public static void main(String[] args) {
        System.out.println("Start of main thread");
         MyThread3 mt = MyThread3.createAndStart("MINE");
         for(int i = 0;i<50;i++){
             try {
                 Thread.sleep(200);
             }catch (InterruptedException exc){
                 System.out.println("Exception in time");
             }
         }
        System.out.println("Final of main thread");
    }
}
