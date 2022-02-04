package com.leetCode.missingNumbers;

public class MissingNumbers {
    public int missingNumber(int[] nums) {

        int numsSum = nums.length * (nums.length + 1) / 2;
        int arraySum = 0;

        for (int i : nums) {
            arraySum += nums[i];
        }
        return numsSum - arraySum;
    }
}
