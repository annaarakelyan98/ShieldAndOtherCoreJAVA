package com.core_java.chapter_4_class;

public class NewYear {
    String name;
    String style;
    int money;

    NewYear(String n) {
        name = n;
    }

    void toStyle(String s) {
        style = s;
        System.out.println("I love " + style);
    }

    int getMoney(int m) {
        money = m;
        return money;
    }
}
