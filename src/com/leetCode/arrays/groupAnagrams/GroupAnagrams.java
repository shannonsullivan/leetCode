package com.leetCode.arrays.groupAnagrams;

import java.util.*;

/*
49. Group Anagrams
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
*/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String originalString : strs) {
            char[] sortedChars = originalString.toCharArray();
            Arrays.sort(sortedChars);
            String sortedString = String.valueOf(sortedChars);

            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(originalString);
            } else {
                map.put(sortedString, new ArrayList<>());
                map.get(sortedString).add(originalString);
            }
        }

        return new ArrayList<>(map.values());
    }
}
