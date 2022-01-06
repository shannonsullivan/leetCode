package com.leetCode.Arrays.FindNumbersWithEvenNumberOfDigits;

public class FindNumbers {
    public int findNumbers(int[] nums) {
        // Initialize result to 0
        int result = 0;
        // Loop through input array
        for (int n : nums) {
            // Initialize counter to 0
            int counter = 0;
            // While number doesn't equal 0
            while (n != 0) {
                // Divide input number by 10
                n /= 10;
                // Increment counter
                counter++;
            }
            // Check if counter mod 2 equals 0
            if (counter % 2 == 0) {
                // Increment result
                result++;
            }
        }
        // Return result
        return result;
    }
}
