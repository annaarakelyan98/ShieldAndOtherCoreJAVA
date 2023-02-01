package com.core_java.repitition;

class RepititionMain {
    String name;
    String surname;

    private int age;

    RepititionMain(int a) {
    this.age = a;
    }

    RepititionMain(String n, String s) {
        this.name = n;
        this.surname = s;
    }

    void setAge(int a) {
        this.age = a;
    }

    int getAge() {
        return this.age;
    }

    void member() {
        System.out.print(name + " " + surname + ": ");
    }
}

class Ann extends RepititionMain {
    String gender;

    Ann(String n, String s, String g) {
        super(n, s);
        this.gender = g;
    }

    void member() {
        System.out.println(name + " " + surname + " " + gender);
    }
}

public class RepititionCapter7 {
    public static void main(String[] args) {
        RepititionMain r = new RepititionMain("Ann", "Arakelyan");
        Ann ann = new Ann("Arman", "Arakelyan", "male");

        RepititionMain repititionMain = new Ann("A", "b", "c");

        r.setAge(23);

        r.member();
        System.out.println(r.getAge());

        ann.member();
    }
}
