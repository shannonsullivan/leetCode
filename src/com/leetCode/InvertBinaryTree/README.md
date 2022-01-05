## 226. Invert Binary Tree
Given the root of a binary tree, invert the tree, and return its root.


### Example 1:
![alt text][image1]

[image1]: https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg "Image 1"

Input: root = [4,2,7,1,3,6,9]\
Output: [4,7,2,9,6,3,1]

### Example 2:
![alt text][image2]

[image2]: https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg "Image 2"
Input: root = [2,1,3]\
Output: [2,3,1]

### Example 3:

Input: root = []\
Output: []

### Constraints:
- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

### Pseudocode:
1. Check if root is null
2. Initialize right tree node
3. Initialize left tree node
4. Swap nodes by assigning left to right root and right to left root
5. Return root
