package com.core_java.homework5GorcnakanArman3;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        //1
        int[] array = {1, 5, 8, 44, 2, 7};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);

        //2
        int[] a = {4, 8, 5, 3};
        int mult = 1;
        for (int i : a) {
            mult *= i;
            if (i == 3) {
                break;
            }
        }
        System.out.println("\nMult is: " + mult + "\n");

        //3
        //for each ciklov chi linum
        //arandzin elementneri het
        //gorcoxutyun katarel
        int[] arr = {5, 9, 2, 10};
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 10;

            System.out.println("arr[i] = " + arr[i]);
        }

        //4
        int[] array1 = {7, 5, 4, 2, 6, 9, 8};
        int val = 4;
        boolean bul = false;

        for (int j : array1) {
            if (j == val) {
                bul = true;
            }
        }
        if (bul) {
            System.out.println("\nNashli!\n");
        }

        //5//String
        String str1 = new String("1st way!");
        String str2 = "2nd way!";
        String str3 = new String(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("3rd way!" + str3);
        System.out.println();

        ////////////////////////////
        String string1 = "Java lider of Internet!";
        String string2 = new String(string1);
        String string3 = "Java strings are effective!";
        int result, idx;
        char ch;
        string1.toUpperCase();
        string1.toLowerCase();

        //erkarutyun@, length()
        System.out.println("String1 length is! " + string1.length());
        System.out.println();

        //charAt(index)
        for (int i = 0; i < string1.length(); i++) {
            System.out.print(string1.charAt(i));
        }
        System.out.println("\n");

        System.out.println(string1.charAt(14));

        //equals
        if (string1.equals(string2)) {
            System.out.println("\nstring1 equals to string2!");
        } else {
            System.out.println("Not equal!");
        }

        System.out.println();

        if (string1.equals(str3)) {
            System.out.println("string1 equals to string3!");
        } else {
            System.out.println("Not equal!");
        }
        System.out.println();

        //compareTo()
        result = string1.compareTo(string3);
        if (result == 0) {
            System.out.println("string1 equals to string3!");
        } else if (result < 0) {
            System.out.println("string1 less than string3!");
        } else {
            System.out.println("string1 greater than string3!");
        }

        System.out.println();

        //indexOf
        String string = "One, Two, Three, Four, Three";

        idx = string.indexOf("Two");

        System.out.println("idx: " + idx);

        idx = string.lastIndexOf("Three");

        System.out.println("idx = " + idx);

        System.out.println();

        //concotation/ ezrakacutyun// +
        String string4 = string1 + string2 + string3;

        System.out.println("strin4: " + string4);
        System.out.println();

        //Array of Strings
        String[] strs = {"This", "String", "is", "test!"};

        System.out.println("Our Array!");
        for (String s : strs) {
            System.out.print(s + " ");
        }

        System.out.println("\n");

        strs[2] = "is so interesting";

        System.out.println("Different Array!");

        for (String k : strs) {
            System.out.print(k + " ");
        }

        System.out.println("\n");

        //subString
        String string5 = "My favourite actress is Nathalia Ramos!";
        String subStr = string5.substring(24, 32);

        System.out.println("string5: " + string5);
        System.out.println("Strinigi mas: " + subStr);

        System.out.println();

        //switch String
        Scanner str = new Scanner(System.in);
        String str4 = str.nextLine();

        switch (str4){
            case "open":
                System.out.println("bac e!");
                break;
            case "close":
                System.out.println("pak e!");
                break;
            default:
                System.out.println("chmtar!");
                break;
        }
    }
}
