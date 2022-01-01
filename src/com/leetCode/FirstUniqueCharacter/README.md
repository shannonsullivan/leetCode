## 387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

### Example 1:
Input: s = "leetcode"\
Output: 0

### Example 2:
Input: s = "loveleetcode"\
Output: 2

### Example 3:
Input: s = "aabb"\
Output: -1

### Constraints:

- 1 <= s.length <= 105\
- s consists of only lowercase English letters.

### Pseudocode:
1. Instantiate hash map to map characters to integer
2. Iterate through input string
3. Initialize pointer char to input string char at i for key
4. If hashmap doesn't contain current char key
5. Then put the key in map as char i
6. Else put key in map as invalid -1 to override key as not unique
7. Initialize ist char index min to integer max value
8. Iterate through map 
9. If hash map index is not invalid
10. And hash map index is less than min
11. Then set min to index
12. If min equals max value (Use ternary)
13. Then return -1
14. Else return min which is 1st value in hash map that is unique
