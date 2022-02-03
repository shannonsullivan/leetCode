## 977. Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

### Example 1:

Input: nums = [-4,-1,0,3,10]\
Output: [0,1,9,16,100]\
Explanation: After squaring, the array becomes [16,1,0,9,100].\
After sorting, it becomes [0,1,9,16,100].

### Example 2:

Input: nums = [-7,-3,2,3,11]\
Output: [4,9,9,49,121]


### Constraints:

- 1 <= nums.length <= 10<sup>4</sup>
- -104 <= nums[i] <= 10<sup>4</sup>
- nums is sorted in non-decreasing order.

### Pseudocode:

1. Initialize index pointer
2. Initialize lower pointer starting at 0
3. Initialize upper pointer starting at end of array
4. Instantiate new array to return results
5. While lower pointer is less than or equal to upper pointer
6. Check if absolute value of lower is greater than or equal to absolute of upper
7. If true, assign value of lower pointer squared to index
8. Post-increment lower
9. Else if false, assign value of upper pointer squared to index 
10. Post-decrement upper
11. Then post-decrement index
12. Return result