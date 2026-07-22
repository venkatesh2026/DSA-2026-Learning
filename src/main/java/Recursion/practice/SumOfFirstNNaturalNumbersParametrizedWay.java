package Recursion.practice;

public class SumOfFirstNNaturalNumbersParametrizedWay {

    public static void main(String[] args) {
        int n = 5;
        sum(n, 0);
    }

    public static void sum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum(n - 1, sum + n);
    }
}
