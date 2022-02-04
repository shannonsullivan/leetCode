## 344. Reverse String 

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



### Example 1:

Input: s = ["h","e","l","l","o"]\
Output: ["o","l","l","e","h"]

### Example 2:

Input: s = ["H","a","n","n","a","h"]\
Output: ["h","a","n","n","a","H"]


### Constraints:

- 1 <= s.length <= 10<sup>5</sup>
- s[i] is a printable ascii character.

### Pseudocode :
1. Use two-pointer technique
2. Move both beginning and end to middle and end when both reach the middle
3. Set 1st pointer to start
4. Set 2nd pointer to end
5. While start is less than end
6. Swap start index with end index
7. Initialize temp char to point at 1st letter
8. Set 1st letter to last letter
9. Set last letter to temp
10. Increment start pointer
11. Decrement end pointer