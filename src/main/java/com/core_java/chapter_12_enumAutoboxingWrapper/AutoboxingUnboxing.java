package com.core_java.chapter_12_enumAutoboxingWrapper;

public class AutoboxingUnboxing {
    static void m1(Integer v) {
        System.out.println("m1()-in trvum e Integer arjeq: " + v);
    }

    static int objectToVar(Integer v){
       return v;
    }

    static int m2() {
        return 20;
    }

    //autoboxing 25 in Integer type object
    static Integer m3() {
        return 25;
    }
    public static void main(String[] args) {
        //Autoboxing
        Integer iOb = 100;

        //Unboxing
        int i = iOb;

        System.out.println(i + " " + iOb);

        //Autoboxing and unboxing

        //1//int 23 is autoboxed
        m1(23);

        //2//autoboxing from Object to basic
        Integer integer = m2();
        System.out.println(integer);

        //3//unboxing from basic to Object
        int i1 = m3();
        System.out.println(i1);
    }
}
