package com.core_java.chapter_6_7.inheritance;
/*
 * if method is final, it hasn't inherited in
 * subclass
 *
 * final class doesn't have subclass
 *
 * final variables should be assigned at first,
 * and won't be changed during whole project.
 * to call them, we need their reference(.)
 * */

class FinalKeyword {
    double x, y;

    final double sum() {
        return x + y;
    }

    final int i = 10;
}

class Perimeter extends FinalKeyword {
    //error
   /* double sum() {
        return (x + y) * 2;
    }*/
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalKeyword x = new FinalKeyword();
        System.out.println(x.i);
    }
}
