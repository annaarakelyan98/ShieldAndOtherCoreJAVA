package com.core_java.oldFiles;

public class MaxMin {
    public static void main(String[] args) {
        int array1[] = new int[]{1, 4, 3, 5, 6};
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        System.out.println("max = " + max);

        //matrix
        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //max matrix
        int ar1[][] = {{3, 4, 5, 6},
                       {1, 3, 7, 8},
                       {2, 4, 6, 7}};
        int max1 = ar1[0][0];
        for (int k = 0; k < 3; k++) {
            for (int m = 0; m < 4; m++) {
                if (max1 < ar1[k][m]) {
                    max1 = ar1[k][m];
                }
            }
        }
        System.out.println("max1 = " + max1);

        //min matrix
        int ar2[][] = {{12, 3, 5}, {6, 0, 4}, {8, 5, 10}};
        int min1 = ar2[0][0];
        for (int l = 0; l < 3; l++) {
            for (int n = 0; n < 3; n++) {
                if (min1 > ar2[l][n]){
                    min1 = ar2[l][n];
                }
            }
        }
        System.out.println("min1 = " + min1);
    }
}

