package com.core_java.chapter_12_enumAutoboxingWrapper;

enum Family {
    Arman, Artur, Anna, Vard, Manuela
}

enum Transport {
    car(120), airplane(250), bicycle(40);

    private int speed;

    Transport(int s) {
        this.speed = s;
    }

    int getSpeed() {
        return speed;
    }
}

public class Enum {

    public static void main(String[] args) {
        Family member = Family.Arman;
        System.out.println(member);

        if (member == Family.Arman) {
            System.out.println("True");
        }

        Family name = Family.Artur;

        switch (name) {
            case Anna:
                System.out.println("Anna");
                break;
            case Artur:
                System.out.println("Name is Artur");
                break;
            case Arman:
                System.out.println("Arman");
                break;
        }

        System.out.println(Family.Anna);

        //methods values() and valueOf()
        System.out.println("\nvalues() and valueOf() methods");
        Family[] FamMem = Family.values();

        for (Family t : FamMem) {
            System.out.print(t + " ");
        }

        System.out.println();

        Family family = Family.valueOf("Vard");
        System.out.println(family);

        //Transport enum
        System.out.println("\nTransports and their speeds: ");
        for (Transport t : Transport.values()) {
            System.out.println(t + ": " + t.getSpeed());
        }

        System.out.println("\nTransport");
        System.out.println(Transport.car/*.getSpeed()*/ + "\n");

        System.out.println("ordinal() and compareTo() methods");

        //methods ordinal() and compareTo()
        Transport tr = Transport.airplane;
        Transport tr1 = Transport.bicycle;
        Transport tr2 = Transport.car;

        for (Transport t : Transport.values()) {
            System.out.println(t + ": " + t.ordinal());
        }

        System.out.println("\ntr compareTo tr1: " + tr.compareTo(tr1));
        System.out.println("tr compareTo tr2: " + tr.compareTo(tr2));
        System.out.println("tr compareTo tr: " + tr.compareTo(tr));

        if (tr.compareTo(tr1) < 0){
            System.out.println("\nairplane before bicycle!");
        }
        if (tr.compareTo(tr2) > 0){
            System.out.println("airplane after car!");
        }
        if (tr.compareTo(tr) == 0){
            System.out.println("airplane is airplane!");
        }
    }
}
