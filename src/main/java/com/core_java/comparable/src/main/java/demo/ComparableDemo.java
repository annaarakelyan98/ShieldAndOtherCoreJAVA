package com.core_java.comparable.src.main.java.demo;

import java.util.*;

class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    //sort movies by year
    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    //constructor
    public Movie(String n, double r, int y) {
        this.name = n;
        this.rating = r;
        this.year = y;
    }

    //getter methods
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Movie> alm = new ArrayList<>();

        alm.add(new Movie("House of Anubis 1", 4.8, 2010));
        alm.add(new Movie("House of Anubis 2", 5.0, 2012));
        alm.add(new Movie("Mummy 2", 4.5, 2001));
        alm.add(new Movie("Mummy 1", 4.3, 1999));

        Collections.sort(alm);

        System.out.println("Movies sorted by year! ");

        for (Movie movie : alm) {
            System.out.println(movie.getName() + " " + movie.getRating() + " "
                    + movie.getYear());
        }
    }
}
