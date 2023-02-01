package com.core_java.protectedAccessModifierExample;

public class A {
    double calculator(double price){
        return price - price*23/100;
    }

    public static void main(String[] args) {
        System.out.println(Demo.i);
        System.out.println(Integer.MAX_VALUE);
        /*Demo.main("Ann");*/
        Demo demo = new Demo();
        System.out.println(demo.j);
    }
}
