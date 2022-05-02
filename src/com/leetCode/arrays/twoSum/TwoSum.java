package com.leetCode.arrays.twoSum;

import java.util.HashMap;

/*
* 1. Two Sum
* Given an array of integers nums and an integer target, return
* indices of the two numbers such that they add up to target.
*/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumHash(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(target - nums[i])) {
                hashMap.put(nums[i], i);
            } else {
                int[] result = {i, hashMap.get(target - nums[i])};
                return result;
            }
        }
        return null;
    }
}
