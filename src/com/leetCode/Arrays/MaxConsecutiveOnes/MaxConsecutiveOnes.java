package com.leetCode.Arrays.MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Initialize counter to 0
        int counter = 0;
        // Initialize result to 0
        int result = 0;
        // Iterate through input array
        for (int n : nums) {
            // Check if n is equal to 0
            if (n == 0) {
                // If true assign the max between counter and result to result
                result = Math.max(counter, result);
                // Assign 0 to counter
                counter = 0;
            } else {
                // Else if false increment counter
                counter++;
            }
        }
        // Return the max between counter and result
        return Math.max(counter, result);
    }
}
