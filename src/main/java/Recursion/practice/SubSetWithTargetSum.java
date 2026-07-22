package Recursion.practice;

import java.util.ArrayList;
import java.util.List;

public class SubSetWithTargetSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        int target = 2;
        List<List<Integer>> result = new ArrayList<>();
        target(nums, 0, new ArrayList<>(), result, 0, target);
        System.out.println(result);

    }

    public static void target(int[] nums, int index, List<Integer> list, List<List<Integer>> result, int sum, int target) {
        if (index >= nums.length) {
            if (sum == target)
                result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        sum = sum + nums[index];
        target(nums, index + 1, list, result, sum, target);
        Integer remove = list.remove(list.size() - 1);
        sum = sum - remove;
        target(nums, index + 1, list, result, sum, target);
    }
}
