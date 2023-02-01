package com.core_java.protectedAccessModifierExample;

public class B extends A {
    double calculator(double price){
        double initialSalary = price - price*23/100;
        return initialSalary - 10000;
    }
}
