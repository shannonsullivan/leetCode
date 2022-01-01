package com.leetCode.SingleNumber;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
