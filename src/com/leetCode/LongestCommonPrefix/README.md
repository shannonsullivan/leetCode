## 14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

### Example 1:
Input: strs = ["flower","flow","flight"]\
Output: "fl"

### Example 2:
Input: strs = ["dog","racecar","car"]\
Output: ""\
Explanation: There is no common prefix among the input strings.


### Constraints:
- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lower-case English letters.

### Pseudocode:
1. Check if input array is empty return empty string
2. Initialize prefix string to 1st index of input string array
3. Iterate through input array
4. While input string index i index of prefix doesn't equal 0
5. Then set prefix to prefix substring range 0 to end of prefix array
6. Return prefix