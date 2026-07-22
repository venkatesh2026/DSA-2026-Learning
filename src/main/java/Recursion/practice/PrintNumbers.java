package Recursion.practice;

public class PrintNumbers {

    static int count = 0;

    public static void main(String[] args) {
        print();
    }

    public static void print() {
        if (count == 10) {
            return;
        }
        System.out.println("count:" + count);
        count++;
        print();
    }
}
