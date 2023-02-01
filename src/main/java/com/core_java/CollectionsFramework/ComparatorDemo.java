package com.core_java.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    private String name;
    private String surname;
    private int age;


    Person(String n, String s, int a) {
        this.name = n;
        this.surname = s;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}

class SortingByName implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class SortingByAge implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        if (p1.getAge() < p2.getAge()) return -1;
        else if (p1.getAge() > p2.getAge()) return 1;
        else return 0;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person("Anna", "Arakelyan", 22));
        person.add(new Person("Vard", "Khudatyan", 27));
        person.add(new Person("Artur", "Arakelyan", 25));
        person.add(new Person("Arman", "Arakelyan", 28));

        SortingByAge sortingByAge = new SortingByAge();

        Collections.sort(person, sortingByAge);

        System.out.println("Sorted by age!");
        for (Person person1 : person) {
            System.out.println(person1.getName() + " " + person1.getSurname() +
                    " " + person1.getAge());
        }

        System.out.println("\nSorted by name!");

        SortingByName sortingByName = new SortingByName();

        Collections.sort(person, sortingByName);

        for (Person person2 : person) {
            System.out.println(person2.getName() + " " + person2.getSurname() +
                    " " + person2.getAge());
        }
    }
}
