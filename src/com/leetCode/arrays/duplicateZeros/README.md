## 1089. Duplicate Zeros

Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

**Note** that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.



### Example 1:

Input: arr = [1,0,2,3,0,4,5,0]\
Output: [1,0,0,2,3,0,0,4]\
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

### Example 2:

Input: arr = [1,2,3]\
Output: [1,2,3]\
Explanation: After calling your function, the input array is modified to: [1,2,3]


### Constraints:

- 1 <= arr.length <= 104
- 0 <= arr[i] <= 9

### Pseudocode:
1. Iterate through input array starting at end
2. Check if index is equal to 0
3. Start at last index in array and while greater than 0
4. Assign the preceding index to current index