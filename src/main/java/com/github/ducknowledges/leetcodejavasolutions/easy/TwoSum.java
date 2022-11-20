package com.github.ducknowledges.leetcodejavasolutions.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * https://leetcode.com/problems/two-sum/
 * */
public class TwoSum {


    public int[] getTwoSum(int[] num, int target, String timeComplexity) {
        return switch (timeComplexity) {
            case "O(n^2)" -> this.getTwoSumBigOn2(num, target);
            case "O(n)"   -> this.getTwoSumBigOn(num, target);
            default -> new int[]{};
        };
    }

    /*
    * Time: O(n^2)
    * Space: O(1)
    * */
    private int[] getTwoSumBigOn2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    /*
     * Time: O(n)
     * Space: O(n)
     * */
    private int[] getTwoSumBigOn(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
