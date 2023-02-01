package com.core_java.chapter_6_7.inheritance;

class Super {
    void who() {
        System.out.println("who() in Sup");
    }
}

class FirstSubclass extends Super {
    void who() {
        System.out.println("who() in Sub1");
    }
}

class SecondSubclass extends Super {
    void who() {
        System.out.println("who() in Sub2");
    }
}

public class DynamicMethodDemo {
    public static void main(String[] args) {
        Super aSuper = new Super();
        FirstSubclass firstSubclass = new FirstSubclass();
        SecondSubclass secondSubclass = new SecondSubclass();

        Super sup;

        sup = aSuper;
        sup.who();

        sup = firstSubclass;
        sup.who();

        sup = secondSubclass;
        sup.who();
    }
}