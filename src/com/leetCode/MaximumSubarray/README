#53. Maximum Subarray
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

#Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]\
Output: 6\
Explanation: [4,-1,2,1] has the largest sum = 6.

#Example 2:
Input: nums = [1]\
Output: 1

#Example 3:
Input: nums = [5,4,-1,7,8]\
Output: 23

#Constraints:
- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104

#Pseudocode:
Kadane's Algorithm
1. Initialize max sum to start of input array
2. Initialize current sum to max sum
3. Iterate through input array starting at 2nd index
4. Set current sum to return max value between input array at i index plus current sum or input array at i
5. Set max sum to return max value between current and max sum
6. Return max sum
