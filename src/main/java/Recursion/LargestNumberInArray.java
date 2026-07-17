package Recursion;

public class LargestNumberInArray {

    public static void main(String[] args) {
        System.out.println(largest(new int[]{1, 2, 3, 9, 4, 5, 6, 7}));

    }

    public static int largest(int[] nums) {
        return largest(nums, 0, nums[0]);
    }

    private static int largest(int[] nums, int index, int largest) {
        if (index >= nums.length) {
            return largest;
        }
        return largest(nums, index + 1, Math.max(largest, nums[index]));
    }
}
