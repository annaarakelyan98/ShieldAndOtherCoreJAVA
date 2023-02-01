package algorithms;

public class DuplicateNumber {
    //find duplicate member
    public static void main(String[] args) {
        int[] ar = {2, 3, 5, 8, 6, 5, 2, 7, 3};

        duplicate(ar);
    }

    public static void duplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate num is: " + arr[i]);
                }
            }
        }
    }
}
