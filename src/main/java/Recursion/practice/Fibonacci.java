package Recursion.practice;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(4));

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibonacci(n - 1);
        int secondLast = fibonacci(n - 2);
        return last + secondLast;
    }
}
