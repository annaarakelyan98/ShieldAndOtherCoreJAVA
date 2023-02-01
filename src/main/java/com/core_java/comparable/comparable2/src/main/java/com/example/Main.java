package com.core_java.comparable.comparable2.src.main.java.com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Arman", 27));
        personList.add(new Person("Anna", 22));
        personList.add(new Person("Artur", 25));

        Collections.sort(personList);
        System.out.println(personList);

        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.age.compareTo(o1.age);
            }
        };

        Collections.sort(personList, personComparator);
        System.out.println(personList);
    }
}
