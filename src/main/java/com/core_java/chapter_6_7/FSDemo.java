package com.core_java.chapter_6_7;
//????????????????????
class FailSoftArray {
   /* for private variables we write public methods*/
    private int a[];
    private int errval;

    public int length;

    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        length = size;
    }

    public int get(int index) {
        if (indexOK(index)) {
            return a[index];
        }
        return errval;
    }

    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK(int index) {
        return index >= 0 & index < length;
    }
}

public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        System.out.print("hujhvskd");
        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        for (int j = 0; j < (fs.length * 2); j++) {
            x = fs.get(j);
            if (x != -1) {
                System.out.print(x + " ");
            }
        }
        System.out.println(" ");

        System.out.println("\nfsfhsjhfs");
        for (int k = 0; k < (fs.length * 2); k++) {
            if (!fs.put(k, k * 10)) {
                System.out.println("index" + k + "durs e diapazonic");
            }
        }

        for (int j = 0; j < (fs.length * 2); j++) {
            x = fs.get(j);
            if (x != -1) {
                System.out.print(x + " ");
            } else {
                System.out.println("index" + j + "durs e diapazonic");
            }
        }
    }
}
