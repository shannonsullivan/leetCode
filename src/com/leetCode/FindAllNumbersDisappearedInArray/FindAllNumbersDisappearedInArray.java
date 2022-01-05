package com.leetCode.FindAllNumbersDisappearedInArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disappearedNumbers = new ArrayList<>();
        HashSet<Integer> numbers = new HashSet<>();
        for (int i : nums) {
            numbers.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!numbers.contains(i)) {
                disappearedNumbers.add(i);
            }
        }
        return disappearedNumbers;
    }
}
