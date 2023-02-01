package com.core_java.chapter_6_7.inheritance;

class A {
    int i;

    A(){
        System.out.println("Constructor A");
    }
}

class B extends A {
    int i;

    B(){
        System.out.println("Constructor B");
    }

    B(int a, int b) {
        super.i = a;//by super A assigned to i
        i = b;//B i
    }

    void str() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class C extends B{
    C(){
        System.out.println("Constructor C\n");

    }
}

public class SuperclassConstructorWorkFirstDemo {
    public static void main(String[] args) {
        C ob1 = new C();
        B ob = new B(5,3);

        ob.str();
    }
}
