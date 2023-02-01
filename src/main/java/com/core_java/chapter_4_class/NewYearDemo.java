package com.core_java.chapter_4_class;

public class NewYearDemo {
    public static void main(String[] args) {
        NewYear santaClaus = new NewYear("Santa Claus");
        NewYear snowMaiden = new NewYear("Snow Maiden");
        NewYear christmasTree = new NewYear("Christmas Tree");
        NewYear gifts = new NewYear("gifts");

        System.out.println(santaClaus.name + " is my favourite person in Christmas!");
        santaClaus.toStyle("Santa's gifts!\n");

        System.out.println(snowMaiden.name + " is Santa's granddaughter!");
        snowMaiden.toStyle("her beautiful smile!\n");

        System.out.println(christmasTree.name + " is the most beautiful tree in the world!");
        christmasTree.toStyle("Christmas tree's decoration!");
        System.out.println("Christmas tree's price is " + christmasTree.getMoney(8000) + "$.\n");

        System.out.println("my favourite things in Christmas are " + gifts.name + "!");
        gifts.toStyle("to get gifts!");
        System.out.println("Gifts price is " + gifts.getMoney(3000) + "$.\n");
    }
}
