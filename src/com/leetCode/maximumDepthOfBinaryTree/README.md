## 104. Maximum Depth of Binary Tree

Given the root of a binary tree, return its maximum depth.

A binary tree's **maximum depth** is the number of nodes along the longest path from the root node down to the farthest leaf node.

### Example 1:

![alt text](https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg "Image 1")

Input: root = [3,9,20,null,null,15,7]\
Output: 3

### Example 2:

Input: root = [1,null,2]\
Output: 2

### Constraints:

- The number of nodes in the tree is in the range [0, 104].
- -100 <= Node.val <= 100

### Pseudocode:

Use top down preorder recursion.\
Compute height recursively with a subtree 
that adds to height at each level when return from the base case. 
When subtree reaches a leaf it's at the base case and breaks.
1. Create base case by checking if root equals null returning 0
2. Return the larger subtree adding 1 because the root is one level higher than subtrees