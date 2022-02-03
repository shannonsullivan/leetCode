package com.leetCode.arrays.findNumbersWithEvenNumberOfDigits;

public class FindNumbers {
    public int findNumbers(int[] nums) {
        int result = 0;

        for (int n : nums) {
            int counter = 0;

            while (n != 0) {
                n /= 10;
                counter++;
            }

            if (counter % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
