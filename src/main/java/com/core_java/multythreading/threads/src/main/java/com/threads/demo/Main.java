package com.core_java.multythreading.threads.src.main.java.com.threads.demo;

public class Main {
    public static void main(String[] args) {
        int num = 20;
        final int num2 = 20;
        switch (num) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("zero");
                break;
            case num2:
                System.out.println("one");

        }
        String a = "gdgs".replace('g', 'Z').trim().concat("sdasd");
        /*a.replace('g', 'Z').trim().concat("sdasd");*/
        System.out.println(a);

        StringBuilder sb = new StringBuilder("123456");
        System.out.println(sb.subSequence(2, 4));
        sb.deleteCharAt(3);

        System.out.println(sb);

        int i = 10;
        if (++i > 10) {
            System.out.println("sas");
        }
    }
}
