package com.core_java.gorcnakan_Arman_1;

import java.util.Arrays;

public class ExamsQuestions {

    //1 Find the subtraction of the sum of even and the sum of odd numbers of the array.
    int getEvenOddNumbersDifference(int[] arg1) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i] % 2 == 0) {
                evenSum += arg1[i];
            } else {
                oddSum += arg1[i];
            }
        }
        return evenSum - oddSum;
    }

    //2 Given an array of integers. Return the count of negative integers.
    int negativeElementsCount(int[] arg1) {
        int count = 0;

        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i] < 0) {
                count++;
            }
        }
        return count;
    }

    //3 Given a matrix. Find the biggest and smallest elements subtraction.
    int matrixSumOfMinMax(int[][] arg1) {
        int max = arg1[0][0];
        int min = arg1[0][0];

        for (int[] array : arg1) {
            for (int i : array) {
                if (i > max) {
                    max = i;
                }

                if (i < min) {
                    min = i;
                }
            }
        }

        return max + min;
    }

    //4 Given two arrays of numbers. Merge them into one array without duplicates and sort 
    // in increasing order.
    int[] mergeArraysAndSort(int[] arr1, int[] arr2) {
        int firstArrayLength = arr1.length;
        int secondArrayLength = arr2.length;

        int[] result = new int[firstArrayLength + secondArrayLength];

        System.arraycopy(arr1, 0, result, 0, firstArrayLength);
        System.arraycopy(arr2, 0, result, firstArrayLength, secondArrayLength);

        return Arrays.stream(result).sorted().distinct().toArray();
    }
}
