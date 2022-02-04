## 326. Power of Three

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.


### Example 1:

Input: n = 27\
Output: true

### Example 2:

Input: n = 0\
Output: false

### Example 3:

Input: n = 9\
Output: true

### Constraints:

- -2<sup>31</sup> <= n <= 2<sup>31</sup> - 1

### Pseudocode:

1. Check if input value it less than 1 and return false
2. While input is divided by 3 and remainder equals 0
3. Then divide input by 3
4. If statement reduced to 1 then return true