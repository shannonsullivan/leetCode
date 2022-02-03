## 485. Max Consecutive Ones

Given a binary array nums, return the maximum number of consecutive 1's in the array.

### Example 1:

Input: nums = [1,1,0,1,1,1]\
Output: 3\
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

### Example 2:

Input: nums = [1,0,1,1,0,1]\
Output: 2


### Constraints:

- 1 <= nums.length <= 10<sup>5</sup>
- nums[i] is either 0 or 1.

### Pseudocode:

1. Initialize counter to 0
2. Initialize result to 0
3. Loop through input array
4. Check if array number is equal to 0
5. If true, assign the max between counter and result to result
6. Assign 0 to counter
7. Else if false, post-increment counter
8. Return the max between counter and result