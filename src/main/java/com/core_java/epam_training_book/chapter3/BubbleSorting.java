package com.core_java.epam_training_book.chapter3;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] array = {4, 2, 8, 3, 1};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                int k;
                if (array[j]>array[j+1]){
                    k = array[j];
                    array[j] = array[j+1];
                    array[j+1] = k;
                }
            }
        }

        for (int i = 0;i< array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
