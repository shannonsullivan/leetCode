package com.leetCode.arrays.validMountainArray;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;

        while (n > 2) {

            for (int i = 0; i < n; i++) {
                if (arr[i] < arr[i + 1] && arr[n - 2] > arr[n - 1]) {
                    continue;
                }

                return true;
            }
        }
        return false;
    }

    public boolean validMountainArrayOption(int[] arr) {
        int n = arr.length, left = 0, right = n - 1;
        if (n < 3)
            return false;
        while (left + 1 < n - 1 && arr[left] < arr[left + 1])
            left++;
        while (right - 1 > 0 && arr[right] < arr[right - 1])
            right--;
        return left == right;
    }
}
