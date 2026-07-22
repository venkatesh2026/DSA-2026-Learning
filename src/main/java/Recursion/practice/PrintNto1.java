package Recursion.practice;

public class PrintNto1 {

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int i) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        print(i - 1);
    }
}
