package com.leetCode.ValidPalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String temp = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                temp += c;
            }
        }
        temp = temp.toLowerCase();

        int start = 0;
        int end = temp.length() -1;

        while (start <= end) {
            if (temp.charAt(start) != temp.charAt(end)) {
                return false;
            } else {
                start += 1;
                end -= 1;
            }
        }
        return true;
    }
}
