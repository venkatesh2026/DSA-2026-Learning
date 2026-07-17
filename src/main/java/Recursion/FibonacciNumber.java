package Recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {


    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }

    public static int fib(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int result1 = fib(n - 1);
        int result2 = fib(n - 2);
        int result = result1 + result2;
        return result;
    }
}
