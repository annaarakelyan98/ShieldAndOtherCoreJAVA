package com.core_java.chapter_4_class;

class Factor{
    boolean isFactor(int a, int b){
        return (b % a) == 0;
    }
}

public class FactorDemo {
    public static void main(String[] args) {
        Factor f = new Factor();
        if (f.isFactor(4,8)){
            System.out.println("4 is 8's divider");
        }
        if (f.isFactor(3,19)){
            System.out.println("Won't print");
        }
    }
}
