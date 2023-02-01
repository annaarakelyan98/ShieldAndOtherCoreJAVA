package com.core_java.oldFiles;

public class ControlStatements {
    public static void main(String[] args) {
        //if, else if
        int month = 4; // April
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else
            season = "Bogus Month";

        System.out.println("April is in the " + season + ".\n");

        //switch1
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                case 2:
                    System.out.println("i is two.");
                    break;
                case 3:
                    System.out.println("i is three.");
                    break;
                default:
                    System.out.println("i is greater than 3.");
            }

        //2
        for (int i = 0; i < 12; i++)
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                default:
                    System.out.println("i is 10 or more");
            }

        //3
        int month1 = 4;
        String season1;
        switch (month1) {
            case 12:
            case 1:
            case 2:
                season1 = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season1 = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season1 = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season1 = "Autumn";
                break;
            default:
                season1 = "Bogus Month";
        }
        System.out.println("April is in the " + season1 + ".\n");

        //4
        String str = "four";
        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match\n");
                break;
        }

        System.out.println("\n");

        //while1
        int n = 10;
        while (n > 0) {
            System.out.println("tick " + n);
            n--;
        }

        System.out.println("\n");

        //2
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) ;
        System.out.println("Midpoint is " + i);

        System.out.println("\n");

        //do-while
        int n1 = 11;
        do {
            System.out.println("tick " + n1);
            n1--;
        } while (n1 > 0);

        System.out.println("\n");

        //or
        int n2 = 4;
        do {
            System.out.println("tick " + n2);
        } while (--n2 > 0);

        System.out.println("\n");

        //for
        int m;
        for (m = 10; m > 0; m--) {
            System.out.println("tick " + m);
        }

        System.out.println("\n");

        //for-each
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println("Summation of first 5 elements: " + sum);

        System.out.println("\n");

        int sum1 = 0;
        int nums1[][] = new int[3][5];
        for (int l = 0; l < 3; l++)
            for (int o = 0; o < 5; o++)
                nums1[l][o] = (l + 1) * (o + 1);
        for (int l = 0; l < 3; l++) {
            for (int o = 0; o < 5; o++) {
                System.out.print(nums1[l][o] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        //for-each 2 ?
        int sum2 = 0;
        int nums2[][] = new int[3][5];
        for (int l = 0; l < 3; l++)
            for (int o = 0; o < 5; o++)
                nums2[l][o] = (l + 1) * (o + 1);
        for (int x[] : nums2) {
            for (int y : x){
                System.out.println("Value is: " + y);
                sum2 += y;
            }
        }
        System.out.println("Summation: " + sum2);

        System.out.println("\n");

        //for-each 3
        int nums3[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 5;
        boolean found = false;
        for(int x : nums3) {
            if(x == val) {
                found = true;
                break;
            }
        }
        if(found)//?
            System.out.println("Value found!");

        //?
        int r, t;
        for(r=0; r<10; r++) {
            for(t=r; t<10; t++)
                System.out.print(".");
            System.out.println();
        }

        //

        outer: for (int i1=0; i1<10; i1++) {
            for(int j1=0; j1<10; j1++) {
                if(j1 > i1) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i1 * j1));
            }
        }
        System.out.println();
    }
}

