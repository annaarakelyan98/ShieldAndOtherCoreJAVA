package com.core_java.chapter_6_7;

class ReFact {

    public ReFact() {
    }

    int fact(int n) {
        int result;

        if (n == 1) {
            return 1;
        } else {
            result = fact(n - 1) * n;
            return result;
        }
    }
}

public class RecursiaFact {
    public static void main(String[] args) {
        ReFact fact = new ReFact();

        System.out.println("5i factorial: " + fact.fact(5));
    }
}
