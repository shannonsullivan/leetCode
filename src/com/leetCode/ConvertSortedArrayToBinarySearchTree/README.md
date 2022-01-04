## 108. Convert Sorted Array to Binary Search Tree
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
![alt text][image1]

[image1]: https://assets.leetcode.com/uploads/2021/02/18/btree1.jpg "Image 2"
### Example 1:
![alt text][image2]

[image2]: https://assets.leetcode.com/uploads/2021/02/18/btree2.jpg "Image 2"

Input: nums = [-10,-3,0,5,9]\
Output: [0,-3,9,-10,null,5]\
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

### Example 2:
![alt text][image3]

[image3]: https://assets.leetcode.com/uploads/2021/02/18/btree.jpg "Image 3"

Input: nums = [1,3]\
Output: [3,1]\
Explanation: [1,3] and [3,1] are both a height-balanced BSTs.

### Constraints:
- 1 <= nums.length <= 10<sup>4</sup>
- -10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>
- nums is sorted in a strictly increasing order.

### Pseudocode:
Find middle index of input array for root node and 
use recursion to build a height-balanced tree.
1. Create a helper recursion function to get tree
2. Get base case by returning null if end is less than start
3. Find middle element of input array by dividing the start and end by 2
4. Initialize a new root tree node with middle element
5. Find left side of tree by calling function recursively with start and middle -1 as end
6. Find right side of tree by calling function recursively with middle +1 as start to end
7. Return the root tree node
8. Return the helper function in original method using the start and end of array as input