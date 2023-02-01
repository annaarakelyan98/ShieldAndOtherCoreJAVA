package com.core_java.oldFiles;

public class Arrays {
    public static void main(String[] args) {
        //array's declaration
        int array1[];
        array1 = new int[5];
        array1[0] = 1;
        array1[1] = 30;
        array1[2] = 6;
        array1[3] = 14;
        array1[4] = 24;
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i] + " ");
        System.out.println(" April has " + array1[1] + " days.");
        //or
        int array2[] = new int[7];

        //or
        int array3[] = {1, 3, 5, 7, 9};

        //average
        int array4[] = {2, 3, 4, 7};
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum = sum + array4[i];
        }
        System.out.println("Average = " + sum / 4);

        //sum
        double array5[] = {2.3, 4.5, 6.7, 8.3};
        double sum1 = 0;
        for (int j = 0; j < 4; j++) {
            sum1 = sum1 + array5[j];
        }
        System.out.println("sum1 = " + sum1);

        //multiplication
        int array6[] = new int[4];
        array6[0] = 5;
        array6[1] = 1;
        array6[2] = 2;
        array6[3] = 10;
        int mult = 1;
        for (int k = 0; k < 4; k++) {
            mult = mult * array6[k];
        }
        System.out.println("mult = " + mult);

        //multidimensional arrays //1
        int array7[][] = new int[4][5];
        int l, m, n = 0;
        for (l = 0; l < 4; l++) {
            for (m = 0; m < 5; m++) {
                array7[l][m] = n;
                n++;

                System.out.print(array7[l][m] + " ");
                System.out.println();
            }
        }

        //SUM 2
        int array8[][] = new int[4][5];
        int sum2 = 0;
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                array7[i][j] = k;
                k++;
                sum2 = sum2 + array7[i][j];
            }
        }
        System.out.println("sum2 = " + sum2);

        //AVERAGE 3
        int a1[][] = new int[4][5];
        int o, p, q = 0;
        int sum3 = 0;
        for (o = 0; o < 4; o++) {
            for (p = 0; p < 5; p++) {
                a1[o][p] = q;
                q++;
                sum3 = sum3 + a1[o][p];
            }
        }
        System.out.println("average = " + sum3 / 20);

        /*
        declaration
        int twoD[][] = new int[4][];
        twoD[0] = new int[5];
        twoD[1] = new int[5];
        twoD[2] = new int[5];
        twoD[3] = new int[5];
         */

        //unequal 4
        int a2[][] = new int[4][];
        a2[0] = new int[1];
        a2[1] = new int[2];
        a2[2] = new int[3];
        a2[3] = new int[4];
        int a, b, c = 0;
        for (a = 0; a < 4; a++)
            for (b = 0; b < a + 1; b++) {
                a2[a][b] = c;
                c++;
            }

        for (a = 0; a < 4; a++) {
            for (b = 0; b < a + 1; b++)
                System.out.print(a2[a][b] + " ");
            System.out.println();
        }

        //5
        double ar1[][] = {
                {3 * 1, 4 * 2, 5 * 3, 6 * 4},
                {1, 3, 7, 8},
                {2, 4, 6, 7}};
        int g, h = 0;
        for (g = 0; g < 3; g++) {
            for (h = 0; h < 4; h++)
                System.out.print(ar1[g][h] + " ");
            System.out.println();
        }

        //6
        int threeD[][][] = new int[3][4][5];
        int i1, j1, k1;
        for(i1=0; i1<3; i1++)
            for(j1=0; j1<4; j1++)
                for(k1=0; k1<5; k1++)
                    threeD[i1][j1][k1] = i1 * j1 * k1;

        for(i1=0; i1<3; i1++) {
            for(j1=0; j1<4; j1++) {
                for(k1=0; k1<5; k1++)
                    System.out.print(threeD[i1][j1][k1] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}


