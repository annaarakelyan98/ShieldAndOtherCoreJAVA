package com.core_java.chapter_6_7;

public class TestMain {
    public static void main(String[] args) {
        Test ob1 = new Test(15, 20);

        System.out.println("No change: " + ob1.a + " and " + ob1.b);

        ob1.change(ob1);
        System.out.println("Changed: " + ob1.a + " and " + ob1.b);
    }
}
