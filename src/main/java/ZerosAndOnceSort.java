import java.util.Arrays;

public class ZerosAndOnceSort {

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 0, 1, 0, 0, 1, 0, 0};
        sortZerosAndOnceCountingApproach(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void sortZerosAndOnceMoveOnceToEnd(int[] nums) {
        int nextZeroElementIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                if (i != nextZeroElementIndex) {
                    int temp = nums[nextZeroElementIndex];
                    nums[nextZeroElementIndex] = nums[i];
                    nums[i] = temp;
                }
                nextZeroElementIndex++;
            }
        }
    }

    public static void sortZerosAndOnceUsingTwoPointersOppDirection(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if (nums[left] != 1) {
                left++;
            } else if (nums[right] != 0) {
                right--;
            } else {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            }
        }
    }

    public static void sortZerosAndOnceCountingApproach(int[] nums) {
        int zeros = 0, once = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else {
                once++;
            }
        }

        for (int i = 0; i < zeros; i++) {
            nums[i] = 0;
        }

        for (int i = zeros; i < zeros + once; i++) {
            nums[i] = 1;
        }
    }
}
