package com.core_java.chapter_8_packageInterface;

class ByThrees implements Series {
    int start, val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class ByTwos implements Series {
    int val;
    int start;

    ByTwos() {
        /*  start = 0;*/
        val = 1;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        /*     start = 0;*/
        val = 2;
    }

    public void setStart(int f) {
        /*  start = f;*/
        val = f;
    }
}

public class Interface {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        ByThrees byThrees = new ByThrees();
        Series ob;

        byTwos.getNextArray(5);
        ob = byTwos;
        System.out.println(ob.getNext());

        byThrees.getNextArray(2);
        ob = byThrees;
        System.out.println(ob.getNext());

        System.out.println("\nSkzbnakan arjeq@ 1 e!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hajod arjeq@: " + byTwos.getNext());
        }

        System.out.println(" \nReset ");
        byTwos.reset();

        System.out.println("\nSkzbnakan arjeq@ 2 e!");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hajod arjeq@: " + byTwos.getNext());
        }

        System.out.println("\nSkzbnakan arjeq@ 100 e!");
        byTwos.setStart(100);
        for (int i = 0; i < 7; i++) {
            System.out.println("Hajod arjeq@: " + byTwos.getNext());
        }
    }
}
