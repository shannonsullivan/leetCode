## 125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

### Example 1:

Input: s = "A man, a plan, a canal: Panama"\
Output: true\
Explanation: "amanaplanacanalpanama" is a palindrome.

### Example 2:

Input: s = "race a car"\
Output: false\
Explanation: "raceacar" is not a palindrome.

### Example 3:

Input: s = " "\
Output: true\
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


### Constraints:

- 1 <= s.length <= 2 * 10<sup>5</sup>
- s consists only of printable ASCII characters.

### Pseudocode:

Two-Pointer Technique
1. Initialize temp string var to empty
2. Iterate through input string array of characters
3. If character is a digit or letter
4. Then add to temp string 
5. Set temp string to ignore case
6. Initialize start pointer to 0
7. Initialize end pointer to end of character array
8. While start is less than ro equal to end
9. If char at start pointer doesn't equal char at end pointer
10. Return false
11. Else increment start and decrement end pointers by 1
12. Return true