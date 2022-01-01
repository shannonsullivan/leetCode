## 217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



### Example 1:
Input: nums = [1,2,3,1]\
Output: true

### Example 2:
Input: nums = [1,2,3,4]\
Output: false

### Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]\
Output: true

### Constraints:

1 <= nums.length <= 105\
-109 <= nums[i] <= 109

### Pseudocode:
Use hash set
1. Instantiate new hash set
2. Iterate through input array
3. If hash set contains i
4. Then return true
5. Add i to hash set
6. Else return false