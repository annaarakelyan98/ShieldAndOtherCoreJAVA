package com.core_java.gorcnakan_Arman_1;

public class Capter6 {
    private String name;
    public String surname;

    int a, b, c;
    int volume;

    int k, m;

    int sum;

    int x;
    static int y;

    static int z = 28;

    Capter6() {
    }

    Capter6(int num) {
        sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
    }

    Capter6(Capter6 ob) {
        sum = ob.sum;
    }

    Capter6(int l, int z) {
        k = l;
        m = z;
    }

    Capter6(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    void setName(String n) {
        this.name = n;
    }

    String getName() {
        return name;
    }

    boolean sameBlock(Capter6 ob) {
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) {
            return true;
        } else return false;
    }

    boolean sameVolume(Capter6 ob) {
        if (ob.volume == volume) return true;
        else return false;
    }

    int sum(Capter6 ob) {
        return ob.k + ob.m;
    }

    //recursion for Factorial
    int factR(int n) {
        int result;
        if (n == 1) return 1;
        else result = factR(n - 1) * n;
        return result;
    }

    int sum() {
        return x + y;
    }
}
