package com.core_java.chapter_6_7;
//static blocks

class StatBlock {
    static double sqrt2;
    static double sqrt3;

    //static block@ ashxatum e classi ashxatelu skzbic
    static {
        System.out.println("Blocki mej!");
        sqrt2 = Math.sqrt(2.0);
        sqrt3 = Math.sqrt(3.0);
    }

    StatBlock(String msg) {
        System.out.println(msg);
    }
}

public class StaticBlock {
    public static void main(String[] args) {

        StatBlock ob = new StatBlock("Constructori mej!");

        System.out.println("2i qarakusi armat: " + StatBlock.sqrt2);
        double i;
        i = StatBlock.sqrt3;
        System.out.println("3i qarakusi armat: " + i);
    }
}
