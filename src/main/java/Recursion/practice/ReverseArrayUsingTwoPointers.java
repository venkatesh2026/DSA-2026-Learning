package Recursion.practice;

import java.util.Arrays;

public class ReverseArrayUsingTwoPointers {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        reverse(nums, ++left, --right);

    }
}
