package com.core_java.homework5GorcnakanArman3;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] array = {1, 2, -5, 28, -25};
        int t;
        int size;
        size = 5;
        for (int l = 0; l < array.length; l++) {
            System.out.println("array[" + l + "] = " + array[l]);
        }

        //bubble sorting
        for ( int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    t = array[j-1];
                    array[j-1] = array[j];
                    array[j] = t;
                }
            }
        }
        System.out.print("array[i] = ");
        for (int k = 0; k < size; k++) {
            System.out.print(array[k]+" ");
        }
    }
}