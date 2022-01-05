## 448. Find All Numbers Disappeared in an Array
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

### Example 1:
Input: nums = [4,3,2,7,8,2,3,1]\
Output: [5,6]

### Example 2:
Input: nums = [1,1]\
Output: [2]

### Constraints:
- n == nums.length
- 1 <= n <= 10<sup>5</sup>
- 1 <= nums[i] <= n

### Pseudocode
1. Instantiate new list of disappeared numbers to return
2. Instantiate new hash set to hold numbers without duplicates
3. Iterate through input array to put numbers in hash set
4. Iterate through input array starting at 1 while less than or equal to length
5. Check if hash set contains input number in array
6. If false then add number to new list and return list