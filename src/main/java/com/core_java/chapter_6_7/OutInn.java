package com.core_java.chapter_6_7;
//Nerdrvac classner

class Outer {
    int arr[];

    Outer(int a[]) {
        arr = a;
    }

    void analyse() {

        Inner obIn = new Inner();

        System.out.println("Max is: " + obIn.max());
        System.out.println("Min is: " + obIn.min());
        System.out.println("Mijin is: " + obIn.mij());
    }

    class Inner {
        int max() {
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }

        int min() {
            int min = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
            return min;
        }

        int mij() {
            int mij = 0;

            for (int i = 0; i < arr.length; i++) {
                mij += arr[i];
            }
            return mij / arr.length;
        }
    }
}

public class OutInn {
    public static void main(String[] args) {
        int array[]={8,1,5,11,4,25};
        Outer obOut = new Outer(array);

       obOut.analyse();
    }
}
