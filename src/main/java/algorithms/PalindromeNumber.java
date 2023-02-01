package algorithms;

/*Given an integer x, return true if x is a
palindrome, and false otherwise.

Palindrome is number which is the same from first to end,
and backwards*/

public class PalindromeNumber {
    static void isPalindrome(int num) {
        int l = num;

        int sum = 0;
        int k;

        while (num > 0) {
            k = num % 10;
            sum = sum * 10 + k;
            num /= 10;
        }

        if (l == sum) {
            System.out.println("Number is palindrome");
        } else System.out.println("Number isn't palindrome!");
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;

        isPalindrome(num1);
        isPalindrome(num2);
    }

 /*
    public boolean isPalindrome(int num) {
        int l = num;
        int sum = 0;
        int k;

        while (num > 0) {
            k = num % 10;
            sum = sum * 10 + k;
            num /= 10;
        }

        if(l == sum){
            return true;
        }else return false;
    }*/
}