package com.core_java.chapter_8_packageInterface;

/*
Interface-i default method-ner@
class-um chen kachvum, bayc object-i
vra ashxatum en
//
bayc kareli e default method-i
classum override anel:
//
if interface B extends A
and they have the same name method
A.super.method_name();
*/

public interface DefaultMethod {
    default void name() {
        System.out.print("Ann ");
    }

    default int age() {
        return 25;
    }

    void surName();

    //static
    static void address() {
        System.out.println("Kotayq!");
    }

    //private
    private int famMember(int n) {
        int count = 0;
        int[] val = new int[n];
        for (int i = 0; i < val.length; i++)
            count++;
        return count;
    }

    //private using
    default int myFamMember(int n) {
        System.out.print("my family members: ");
        return famMember(n);
    }
}
