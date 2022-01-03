package com.leetCode.MajorityElement;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        int counter = 1;
        int pointer = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (counter == 0) {
                pointer = nums[i];
            }
            if (nums[i] == pointer) {
                counter++;
            } else {
                counter--;
            }
        }
        return pointer;
    }
}
