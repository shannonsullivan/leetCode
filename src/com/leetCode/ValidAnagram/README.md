## 242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

### Example 1:
Input: s = "anagram", t = "nagaram"\
Output: true

### Example 2:
Input: s = "rat", t = "car"\
Output: false

### Constraints:
- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

### Pseudocode:
1. Return false if length of both input strings are not equal
2. Initialize char array for 1st input string
3. Initialize char array for 2nd input string
4. Sort both input strings
5. Return true if arrays are equal