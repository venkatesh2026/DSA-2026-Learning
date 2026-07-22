package Recursion.practice;

public class FactorialOfNParametrizedWay {

    public static void main(String[] args) {
        int n = 5;
        fact(n, 1);
    }

    public static void fact(int n, int fact) {
        if (n == 0) {
            System.out.println(fact);
            return;
        }
        fact(n - 1, fact * n);
    }
}
