## 20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

### Example 1:

Input: s = "()"\
Output: true\

### Example 2:

Input: s = "()[]{}"\
Output: true\

### Example 3:

Input: s = "(]"\
Output: false

### Constraints:

- 1 <= s.length <= 10<sup>4</sup>
- s consists of parentheses only '()[]{}'.

### Pseudocode:

1. Return false if input sting doesn't have an even number of characters
2. Instantiate stack of Characters
3. Iterate through characters in string
4. If character equals (  or { or [
5. Then push char on stack
6. Else if char equals ) and stack isn't empty and top of stack equals (
7. Then pop char from stack
8. Else if char equals } and stack isn't empty and top of stack equals {
9. Then pop char form stack
10. Else if char equals ] and stack isn't empty and top of stack equals [
11. Then pop char from stack
12. Else push char on stack
13. Return empty stack to equal true