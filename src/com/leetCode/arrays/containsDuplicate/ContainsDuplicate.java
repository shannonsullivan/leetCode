package com.leetCode.arrays.containsDuplicate;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : nums) {
            if (hashSet.contains(i)) {
                return true;
            }
            hashSet.add(i);
        }
        return false;
    }
}
