package com.core_java.gorcnakan_Arman_1;

public class ObjectsReturningByMethods {
    public static void main(String[] args) {
        ObRetByMethods member = new ObRetByMethods();
        Name name;

        name = member.member(2);

        System.out.println(name.name + ": " + name.count);

        System.out.println(member.noMember(3));
        System.out.println(member.noMember(26));
    }
}
