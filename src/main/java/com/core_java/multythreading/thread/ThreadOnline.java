package com.core_java.multythreading.thread;

class ThreadOn implements Runnable{
    @Override
    public void run(){
        System.out.println("Tread running!");
    }
}

public class ThreadOnline {
    public static void main(String[] args) {
        ThreadOn t = new ThreadOn();
        t.run();
    }
}
