package com.core_java.chapter_3_loops;

import java.util.Scanner;

public class Gosh {
    public static void main(String[] args) {
        //data types
        byte a = 127;
        short b = 32767;

        int c = 444444444;
        long m = 555555555555555L;

        double x = 10.4;
        float y = 10.2f;

        char v = 'f';
        boolean ifTrue = true;
        System.out.println(a + " , " + b + " , " + c + " , " + m + " , " + x + " , " + y + " , " + v + " , " + ifTrue);

        System.out.println();

        //Scanner

        Scanner num = new Scanner(System.in);
        float first, second, sum, sub, mult, div;
        System.out.print("First number is: ");
        first = num.nextFloat();
        System.out.print("Second number is: ");
        second = num.nextFloat();
        sum = first + second;
        sum++;
        System.out.println("Sum is: " + sum);
        sub = first - second;
        sub--;
        System.out.println("Sub is: " + sub);
        mult = first * second;
        System.out.println("Mult is: " + mult);
        div = first / second;
        System.out.println("Div is: " + div);
        System.out.println();
        //
        Scanner du = new Scanner(System.in);
        System.out.println("My String is: " + du.nextLine());

        System.out.println();

        //logical operators, && == != || <= >=

        Scanner num1 = new Scanner(System.in);
        int firstt, secondd = 34;
        boolean isTrue = true;

        System.out.print("First num is: ");
        firstt = num1.nextInt();

        //if firstt==52 e tpi 25, else tpi 24

        secondd = firstt == 52 ? 25 : 24;
        System.out.println(secondd);

        if (firstt >= secondd && isTrue)
            System.out.println("First is greater or equal to 34!");
        else if (firstt == 78)
            System.out.println("First is 78!");
        else System.out.println("First is lower than 34!");

        //Switch/ case

        switch (firstt) {
            case 45:
                System.out.println("First is 45!");
                break;
            case 58:
                System.out.println("First is 58!");
                break;
            default:
                System.out.println("Other numbers!");
        }
    }
}
