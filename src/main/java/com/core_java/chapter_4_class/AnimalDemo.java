package com.core_java.chapter_4_class;

public class AnimalDemo {
    public static void main(String[] args) {
        //cow
        Animal cow = new Animal();

        cow.weight = 250;//kg
        cow.height = 120;//sm
        System.out.println("Cow");
        cow.name("Masha");
        System.out.println("Weight is: " + cow.weight);
        System.out.println("Height is: " + cow.height);
        cow.function("give you milk!");
        System.out.println();

        //pig
        Animal pig = new Animal();

        pig.weight = 50;
        pig.height = 80;
        System.out.println("Pig");
        pig.name("Arvin");
        System.out.println("Weight is: " + pig.weight);
        System.out.println("Height is: " + cow.height);
        pig.function("give you meat!");
        System.out.println();

        //hen
        Animal hen = new Animal();

        hen.height = 30;
        System.out.println("Hen");
        hen.name("Mara");
        System.out.println("Weight is: " + hen.weight);
        System.out.println("Height is: " + hen.height);
        hen.function("give you eggs!");
        System.out.println();

        //Ann
        Animal people = new Animal();
        System.out.println(people.name);
        people.function("Learning Java!");
        System.out.println();

        //constructor
        Animal horse = new Animal(250, "Horse");
        System.out.println(horse.name + " " + horse.height);
    }
}
