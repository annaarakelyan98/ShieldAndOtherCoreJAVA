package com.core_java.homework5GorcnakanArman3;

import java.util.Random;
import java.util.Scanner;

//Narek harc
public class NarekiHarc {
    public static void main(String[] args) {
        System.out.println("nermuceq tiv");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        double[] t = new double[d];

        Random r = new Random();

        for (int g = 0; g < t.length; g++) {
            t[g] = r.nextDouble();
            System.out.println(t[g]);
        }

        int kenter = 0;
        double zGumar = 0;
        double artadryal = 1;

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 != 0) {
                kenter++;

            } else {
                zGumar += t[i];

            }
            if (t[i] > 0 & t[i] < 1) {
                artadryal *= t[i];
            }
        }
        System.out.println("Kenteri qanak: " + kenter);
        System.out.println("Zuygeri gumar: " + zGumar);
        System.out.println("0-i ev 1-i mej @ngac tveri artadryal: " + artadryal);
    }
}
