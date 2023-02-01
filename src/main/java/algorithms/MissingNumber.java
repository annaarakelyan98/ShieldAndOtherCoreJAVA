package algorithms;

public class MissingNumber {
    //find missing member
    static int getMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int restSum = 0;

        for (int i = 0; i < arr.length; i++) {
            restSum += arr[i];
        }
        return sum - restSum;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 3, 6, 1};

        System.out.println("Missing member is: " + getMissingNumber(array));
    }
}
