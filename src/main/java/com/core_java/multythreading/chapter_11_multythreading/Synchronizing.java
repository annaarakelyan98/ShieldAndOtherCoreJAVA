package com.core_java.multythreading.chapter_11_multythreading;

//synchronized method in class
class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]) {
        sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("currently value of " + Thread.currentThread().getName()
                    + " is " + sum);

            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Interrupted exception");
            }
        }
        return sum;
    }
}

class Mythread implements Runnable {
    Thread thrd;
    static SumArray sumArray = new SumArray();
    int a[];
    int answer;

    Mythread(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
    }

    public static Mythread createAndStart(String name, int num[]) {
        Mythread ob = new Mythread(name, num);
        ob.thrd.start();

        return ob;
    }

    public void run() {

        System.out.println(thrd.getName() + " start");

        answer = sumArray.sumArray(a);

        /*if sumArray() method hasn't synchronized
        we can use synchronized block for specific object
        ex.
          synchronized(object){
          code for it
          }
        * */

        System.out.println("sum for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " final");
    }
}

public class Synchronizing {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};

        Mythread mt1 = Mythread.createAndStart("A",a);
        Mythread mt2 = Mythread.createAndStart("B",a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Interrupted exception");
        }

        System.out.println("Final");
    }
}
