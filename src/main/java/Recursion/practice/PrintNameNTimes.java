package Recursion.practice;

import java.util.Scanner;

public class PrintNameNTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        print(1, n);

    }

    public static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Venkatesh");
        print(i + 1, n);
    }
}
