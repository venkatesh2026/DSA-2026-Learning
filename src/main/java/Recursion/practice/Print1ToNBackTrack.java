package Recursion.practice;

//do not use i+1
public class Print1ToNBackTrack {

    public static void main(String[] args) {
        int n = 5;
        print(n);
    }

    public static void print(int i) {
        if (i < 1) {
            return;
        }
        print(i - 1);
        System.out.println(i);
    }
}
