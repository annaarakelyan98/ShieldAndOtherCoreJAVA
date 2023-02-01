package com.core_java.CollectionsFramework;

import java.util.*;

class Member {
    private String names;
    private int ages;

    Member(String n, int a) {
        this.names = n;
        this.ages = a;
    }

    public String getName() {
        return names;
    }

    public int getAge() {
        return ages;
    }
}

class SortingForName implements java.util.Comparator<Member> {
    public int compare(Member p1, Member p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class ComparatorForAge implements java.util.Comparator<Member> {
    public int compare(Member p1, Member p2) {
        if (p1.getAge() > p2.getAge()) return 1;
        else if (p1.getAge() < p2.getAge()) return -1;
        else return 0;
    }
}

public class TreeMaps {
    public static void main(String[] args) {
        //TreeMap
        TreeMap<Member, Integer> tm = new TreeMap<Member, Integer>(new SortingForName());

        Member member = new Member("Mary", 22);
        Member member1 = new Member("Lola", 3);
        Member member2 = new Member("John", 15);

       /* //anonymous class
        Comparator<Member> mc = new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return 0;
            }
        };
*/
        tm.put(member, new Integer(member.getAge()));
        tm.put(member1, new Integer(member1.getAge()));
        tm.put(member2, new Integer(member2.getAge()));

        Set<Member> mee = tm.keySet();

        System.out.println("Sorting by names");

        for (Member mep : mee) {
            System.out.println(mep.getName() + " " + tm.get(mep));
        }

        //sorting by ages
        TreeMap<Member, Integer> tm1 = new TreeMap<Member, Integer>(new ComparatorForAge());

        tm1.put(member, new Integer(member.getAge()));
        tm1.put(member1, new Integer(member1.getAge()));
        tm1.put(member2, new Integer(member2.getAge()));

        Set<Member> members = tm1.keySet();

        System.out.println("\nSorting by ages");

        for (Member a : members) {
            System.out.println(a.getName() + " " + tm1.get(a));
        }
    }
}
