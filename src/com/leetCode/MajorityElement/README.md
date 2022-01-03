## 169. Majority Element
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

### Example 1:
Input: nums = [3,2,3]
Output: 3

### Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

### Constraints:
- n == nums.length
- 1 <= n <= 5 * 104
- -2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1

### Pseudocode:
USe Boyer-Moore majority vote algorithm
1. Initialize counter to 1
2. Initialize pointer to 1st index in input array
3. Iterate through input array starting at 2nd index
4. If counter is equal to 0 then assign new (or previous) index element to pointer 
5. This is because the other element has been balanced off and a new majority element candidate will start counting
7. If the value in the index array is equal to the pointer
8. Then increment the counter
9. Else decrement the counter to balance off current pointer element value
10. After loop has completed, return pointer
