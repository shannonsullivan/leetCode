## 941. Valid Mountain Array

Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
- arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
- arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

![alt text](https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png)

### Example 1:

Input: arr = [2,1]\
Output: false

### Example 2:

Input: arr = [3,5,5]\
Output: false

### Example 3:

Input: arr = [0,3,2,1]\
Output: true


### Constraints:

- 1 <= arr.length <= 10<sup>4</sup>
- 0 <= arr[i] <= 10<sup>4</sup>

### Pseudocode:

1. Iterate through input array
2. If current index is less than next
3. Then continue
4. If current value is greater then next
5. Then return true
6. Else return false