package com.leetCode.arrays.squaresOfSortedArray;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int index= nums.length -1;
        int lower = 0;
        int upper = nums.length -1;

        int[] result = new int[nums.length];

        while (lower <= upper) {
            if (Math.abs(nums[lower]) >= Math.abs(nums[upper])) {
                result[index] = nums[lower] * nums[lower];
                lower++;

            } else {
                result[index] = nums[upper] * nums[upper];
                upper--;
            }
            index--;
        }
        return result;
    }
}
