## 35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

### Example 1:

Input: nums = [1,3,5,6], target = 5\
Output: 2

### Example 2:

Input: nums = [1,3,5,6], target = 2\
Output: 1

### Example 3:

Input: nums = [1,3,5,6], target = 7\
Output: 4

### Constraints:

- 1 <= nums.length <= 10<sup>4</sup>
- -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>
- nums contains distinct values sorted in ascending order.
- -10<sup>4</sup> <= target <= 10<sup>4</sup>

### Pseudocode

Use binary search algorithm
1. Initialize a left pointer 
2. Initialize a right pointer
3. While left pointer is less than or equal to right
4. Find middle of index by dividing the left and right pointer index by 2
5. Check if the middle index is equal to target if true return index
6. Else if middle index is greater than target
7. Then subtract 1 from middle to move index left and assign to right pointer
8. Now we will find the middle of the first half of array to compare to target
9. Else add 1 to middle to move index to right and assign to left pointer
10. Now we will find the middle of the second half of array to compare to target
11. Return the left pointer when index equals the target