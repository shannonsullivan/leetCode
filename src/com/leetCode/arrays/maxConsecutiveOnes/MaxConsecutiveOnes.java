package com.leetCode.arrays.maxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int result = 0;

        for (int n : nums) {
            if (n == 0) {
                result = Math.max(counter, result);
                counter = 0;
            } else {
                counter++;
            }
        }
        return Math.max(counter, result);
    }
}
