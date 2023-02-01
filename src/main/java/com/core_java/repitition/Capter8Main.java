package com.core_java.repitition;

class Capter8M implements Capter8 {

    String name;

    Capter8M(String n) {
        this.name = n;
    }

    public int age() {
        return 22;
    }
}

public class Capter8Main {
    public static void main(String[] args) {
        Capter8M ob = new Capter8M("Ann");

        ob.name();
        System.out.println(ob.name);
        System.out.println("I am: " + ob.age());
    }
}
