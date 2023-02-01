package com.core_java.chapter_8_packageInterface;

class DefaultMethd implements DefaultMethod {
    public void surName() {
        System.out.println("Arakelyan");
    }

    public int age() {
        return 22;
    }
}

class Inheritance implements B {
    public void meth1() {
        System.out.println("Meth1 method's implementation!");
    }

    public void meth2() {
        System.out.println("Meth2 method's implementation!");
    }

    public void meth3() {
        System.out.println("Meth3 method's implementation!");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Inheritance ob = new Inheritance();
        DefaultMethod ob1 = new DefaultMethd();

        ob.meth1();
        ob.meth2();
        ob.meth3();

        System.out.println();

        ob1.name();
        ob1.surName();

        System.out.println("Age is: " + ob1.age());

        DefaultMethod.address();

        System.out.println(ob1.myFamMember(10));
    }
}
