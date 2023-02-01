package com.core_java.multiplication.src.main.java.mult;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = scanner.nextInt();

        System.out.println("Double value of number: " + num * 2);
    }
}
