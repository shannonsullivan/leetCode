package com.leetCode.Arrays.DuplicateZeros;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        // Iterate through input array starting at end
        // Check if index is equal to 0
        // Start at last index in array and while greater than 0
        // Assign the preceding index to that variable
        for (int i = arr.length -1; i >= 0; i--) {
            if (arr[i] == 0) {
                for (int j = arr.length -1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
            }
        }
    }
}
