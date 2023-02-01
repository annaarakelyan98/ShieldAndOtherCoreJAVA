package com.core_java.repitition;

public interface Capter8 {

    int age();

    default void name(){
        System.out.print("My name is: ");
    }
}
