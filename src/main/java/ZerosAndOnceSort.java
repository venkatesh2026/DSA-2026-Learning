import java.util.Arrays;

public class ZerosAndOnceSort {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 0, 0, 1, 0, 0};
        sortTwoPointerApproachOppositeDirection(nums);
        System.out.println(Arrays.toString(nums));
    }

    //count zeros and fill
    public static void sortCountNumbers(int[] nums) {
        int zeros = 0;
        for (int num : nums) {
            if (num == 0) {
                zeros++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (zeros > 0) {
                nums[i] = 0;
                zeros--;
            } else {
                nums[i] = 1;
            }
        }
    }

    //keep two pointers one pointer to scan the array and other to point next zero index
    public static void sortTwoPass(int[] nums) {
        int nextZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[nextZeroIndex] = nums[i];
                nextZeroIndex++;
            }
        }
        for (; nextZeroIndex < nums.length; nextZeroIndex++) {
            nums[nextZeroIndex] = 1;
        }
    }

    public static void sortInplaceSinglePass(int[] nums) {
        int nextZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                if (i != nextZeroIndex) {
                    int temp = nums[nextZeroIndex];
                    nums[nextZeroIndex] = nums[i];
                    nums[i] = temp;
                }
                nextZeroIndex++;
            }
        }
    }

    public static void sortTwoPointerApproachOppositeDirection(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {

            while (left < right && nums[left] == 0) {
                left++;
            }
            while (left < right && nums[right] == 1) {
                right--;
            }

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

    }
}
