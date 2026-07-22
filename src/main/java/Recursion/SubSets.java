package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        List<List<Integer>> result = new ArrayList<>();
        subSets(nums, 0, new ArrayList<Integer>(), result);
        System.out.println(result);
    }

    public static void subSets(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        subSets(nums, index + 1, list, result);
        list.remove(list.size() - 1);
        subSets(nums, index + 1, list, result);
    }
}
