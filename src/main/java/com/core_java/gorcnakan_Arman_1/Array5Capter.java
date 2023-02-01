package com.core_java.gorcnakan_Arman_1;

public class Array5Capter {
    public static void main(String[] args) {
        int[] array = {5, 2, -8, 6, -1, 13};

        int size = 6;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        //two dimensional array
        int[][] a = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = (i * 3) + j + 1;
                System.out.println("array a[" + i + "][" + j + "] = " + a[i][j] + " ");
            }
        }

        //initialization
        int[][] ar = {
                {2, 3},
                {5, 4},
                {8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("ar[0] array length: " + ar[0].length);

        //
        int nums1[] = new int[5];
        int[] nums2 = new int[5];

        System.out.print("nums1: ");
        for (int i = 0; i < 5; i++) {
            nums1[i] = i;
            System.out.print(nums1[i] + " ");
        }

        System.out.println();

        System.out.print("nums2: ");
        for (int j = 0; j < nums2.length; j++) {
            nums2[j] = -j;
            System.out.print(nums2[j] + " ");
        }

        System.out.println();

        System.out.print("Assignment nums2: ");
        nums2 = nums1;
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums2[i] + " ");
        }

        System.out.println();

        //cikl for-each
        int[] arr = {5, 7, 6, 4};
        int sum = 0;

        for (int i : arr) {
            sum += i;
            System.out.println("i: " + i);
        }
        System.out.println("sum is: " + sum);

        //
        int[][] masiv = new int[2][4];
        int sum1 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                masiv[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int x[] : masiv) {
            for (int y : x) {
                System.out.println("y: " + y);
                sum1 += y;
            }
            System.out.println(x[3]);
        }
        System.out.println("sum1 is: " + sum1);

        //String arrays
        String[] strings = {"My", "name is", "Ann!"};

        for (String s : strings) {
            System.out.print(s + " ");
        }

        System.out.println();

        strings[0] = "My bro's";
        strings[2] = "Arman!";
        for (String s : strings) {
            System.out.print(s + " ");
        }

        System.out.println();

        String str = "Arthur!";
        strings[2] = str;
        for (String s : strings) {
            System.out.print(s + " ");
        }

        System.out.println();

        //substring
        String string = "Hello World!";
        String substring = string.substring(6);
        String substring1 = string.substring(0, 5);

        System.out.println(string);
        System.out.println(substring);
        System.out.println(substring1);

        //switch-case-string
        String command = "cancel";

        switch (command) {
            case "enter":
                System.out.println("Enter is my command!");
                break;
            case "cancel":
                System.out.println("Cancel is my command!");
                break;
            default:
                System.out.println("Wrong command!");
                break;
        }

        //bitwise operators
        // | & ^ ~ >> << >>>
        //working with binary numbers

        //&
        char ch = 'A';
        int intChar = (int) ch;

        System.out.println(intChar);

        if ((ch & intChar) != 0) {
            System.out.println("true");
        }

        for (int i = 0; i <= 5; i++) {
            ch = (char) ('A' + i);
            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }
        System.out.println("\nbinary 0b1101 is int " + 0b1101);

        int t;
        byte b = 125;

        for (t = 128; t > 0; t /= 2) {
            if ((t & b) != 0) {
                System.out.print("1 ");
            } else System.out.print("0 ");
        }

        System.out.println();

        //|
        char ch1 = 'A';
        for (int i = 0; i < 7; i++) {
            ch1 = (char) ('A' + i);
            System.out.print(ch1);

            ch1 = (char) ((int) ch1 | 32);
            System.out.print(ch1 + " ");
        }

        //^
        int num = 1285;
        char ch2 = '"';
        int l = num ^ ch2;
        System.out.println("\n" + l);
        System.out.println(l ^ ch2);

        //~
        int n = 55;
        System.out.println(~n);
        System.out.println(n << 2);
        System.out.println(n >> 3);
        System.out.println(1 << 2);
        System.out.println(33 >> 1);

        //operator ?
        int val = 25;
        int absVal = val < 0 ? val : -val;
        System.out.println(absVal);
    }
}