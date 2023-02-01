package algorithms;

import java.util.*;

class Pairs {
    int num1;
    int num2;

    Pairs(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public boolean isTrue(int n) {
        return num1 + num2 == n;
        /*the same as
        if (num1 + num2 == n) {
            return true;
        } else return false;*/
    }
}

//1st way
public class SumOfPairs {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 2, 4, 3};

        int num = 10;

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                Pairs obj = new Pairs(arr[i], arr[j]);

                if (arr[i] + arr[j] == num) {
                    tm.put(obj.num1, obj.num2);
                }

                System.out.println(arr[i] + " + " + arr[j] + " = 11 " + obj.isTrue(11));
            }
        }

        //2nd way
        Set<Map.Entry<Integer, Integer>> m = tm.entrySet();

        for (Map.Entry<Integer, Integer> se : m) {
            System.out.println(se.getKey() + " & " + se.getValue() + ": sum is given number 10!");
        }
    }
}