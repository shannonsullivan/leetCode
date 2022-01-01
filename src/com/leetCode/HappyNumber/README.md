## 202. Happy Number
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
- Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

### Example 1:
Input: n = 19\
Output: true\
Explanation:\
1&#178; + 9&#178; = 82\
8&#178; + 2&#178; = 68\
6&#178; + 8&#178; = 100\
1&#178; + 0&#178; + 0&#178; = 1

### Example 2:
Input: n = 2\
Output: false

### Constraints:
- 1 <= n <= 231 - 1

### Pseudocode:
1. Instantiate new set
2. While set doesn't contain input value
3. Add input to set
4. Initialize sum to 0
5. While input doesn't equal 0
6. Initialize temp value to input mod 10
7. Set sum equal to sum plus temp multiplied by itself
8. Set input equal to input divided by 10
9. Set input equal to sum
10. Return true if input equals 1