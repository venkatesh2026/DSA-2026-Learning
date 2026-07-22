package Recursion.practice;

public class StringPalindromeOrNotFunctionalWay {


    public static void main(String[] args) {
        System.out.println(isPalindrome("malayalam",0,"malayalam".length()));

    }

    public static boolean isPalindrome(String string, int i, int n) {
        if (i >= n / 2) {
            return true;
        }

        if (string.charAt(i) != string.charAt(n - i - 1)) {
            return false;
        }
        return isPalindrome(string, i + 1, n);
    }
}
