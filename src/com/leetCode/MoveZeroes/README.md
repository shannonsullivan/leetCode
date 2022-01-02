## 283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

## Example 1:
Input: nums = [0,1,0,3,12]\
Output: [1,3,12,0,0]

## Example 2:
Input: nums = [0]\
Output: [0]

## Constraints:
- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

## Pseudocode:
Use two pointer technique with fast and slow pointer. 
Fast pointer looks for 0's and slow pointer will only increment 
when values are swapped.
1. Iterate through input array using 2 pointers only incrementing fast pointer
2. If fast pointer doesn't equal 0
3. Initialize temp var and set equal to slow pointer in input array
4. Increment slow pointer and set equal to fast pointer
5. Set fast pointer equal to temp