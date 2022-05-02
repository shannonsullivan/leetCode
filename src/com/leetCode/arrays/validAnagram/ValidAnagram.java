package com.leetCode.arrays.validAnagram;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }

    public boolean isAnagramHash(String s, String t) {

        if (s.length() != t.length()) return false;
        if (s.equals(t)) return true;

        HashMap<Character, Integer> stringSMap = new HashMap<>();
        HashMap<Character, Integer> stringTMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            stringSMap.merge(s.charAt(i), 1, Integer::sum);
            stringTMap.merge(t.charAt(i), 1, Integer::sum);
        }

        for (Character c : stringSMap.keySet()) {
            if (!stringSMap.get(c).equals(stringTMap.get(c))) {
                return false;
            }
        }
        return true;
    }
}
