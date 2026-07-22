package Recursion.practice;

import java.util.ArrayList;
import java.util.List;

public class SubSetWithTargetSumReturnSubSetCount {

    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 2};
        int target = 2;
        int count = target(nums, 0, new ArrayList<>(), 0, target);
        System.out.println(count);

    }

    public static int target(int[] nums, int index, List<Integer> list, int sum, int target) {
        if (index >= nums.length) {
            if (sum == target)
                return 1;
            return 0;
        }
        list.add(nums[index]);
        sum = sum + nums[index];
        int left = target(nums, index + 1, list, sum, target);
        Integer remove = list.remove(list.size() - 1);
        sum = sum - remove;
        int right = target(nums, index + 1, list, sum, target);
        return left + right;
    }
}
