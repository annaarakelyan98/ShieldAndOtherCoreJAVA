package com.core_java.homework5GorcnakanArman3;

public class Array {
    int[] a;

   Array(int[] array) {
        this.a = array;
    }

    //1 // kenteri qanak
    public int KentQan() {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //2 // zuygeri gumar
    public int ZuygGum() {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    //3 //0>eri artadrya
    public int Artadryal() {
        int mult = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                mult *= a[i];
            }
        }
        return mult;
    }

    //4 // min
    public int findMin() {
        int min = this.a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    //5 //max
    public int findMax() {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    //6// sorting
    public void arraySorting() {
        int t;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    //7//print
    public int[] print() {
      return a;
    }
}