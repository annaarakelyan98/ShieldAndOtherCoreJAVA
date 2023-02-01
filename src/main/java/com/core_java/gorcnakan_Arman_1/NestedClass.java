package com.core_java.gorcnakan_Arman_1;

class Outer {
    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void analyze() {
        Inner ob = new Inner();

        System.out.println("min is: " + ob.min());
        System.out.println("max is: " + ob.max());
    }

    class Inner {
        int min() {
            int m = nums[0];

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < m) {
                    m = nums[i];
                }
            }
            return m;
        }

        int max() {
            int max = nums[0];

            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                }
            }
            return max;
        }
    }

    //variable-length arguments
    static void varargs(int... n) {
        System.out.println("Argumentneri qanak@: " + n.length);
        System.out.println("Parunakutyun@");

        for (int i = 0; i < n.length; i++) {
            System.out.println("arg " + i + ": " + n[i]);
        }

        System.out.println();
    }
}

public class NestedClass {
    public static void main(String[] args) {
        int[] ints = {2, 5, 8, 3, 203};

        Outer outer = new Outer(ints);

        outer.analyze();

        System.out.println();

        Outer.varargs(2);
        Outer.varargs(5,3,8);
        Outer.varargs();
    }
}
