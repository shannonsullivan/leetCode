package com.leetCode.Arrays.SquaresOfSortedArray;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        // Initialize an index pointer
        int index= nums.length -1;
        // Initialize left pointer starting at beginning of array
        int left = 0;
        // Initialize right pointer starting at ende of array
        int right = nums.length -1;
        // Instantiate new array to return result
        int[] result = new int[nums.length];
        // While right pointer is greater than ro equal to left pointer
        while (left <= right) {
            // Check if absolute value of right is greater or equal to  absoulte value of left
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                // If true assign value of right pointer squared to the index pointer in result array
                result[index] = nums[left] * nums[left];
                // Decrement right pointer
                left++;
                // Else if false assign value of left pointer squared to the index pointer in result array
            } else {
                result[index] = nums[right] * nums[right];
                // Increment left pointer
                right--;
            }
            index--;
        }
        // Return result array
        return result;
    }
}
