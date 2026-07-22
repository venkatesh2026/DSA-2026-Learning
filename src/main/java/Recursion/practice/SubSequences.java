package Recursion.practice;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        List<List<Integer>> result = new ArrayList<>();
        subSequences(nums, 0, new ArrayList<Integer>(), result);
        System.out.println(result);
    }

    public static void subSequences(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        subSequences(nums, index + 1, list, result);
        list.remove(list.size() - 1);
        subSequences(nums, index + 1, list, result);
    }
}
