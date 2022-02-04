## 101. Symmetric Tree

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

### Example 1:
![alt text](https://assets.leetcode.com/uploads/2021/02/19/symtree1.jpg "Image 1")

Input: root = [1,2,2,3,4,4,3]\
Output: true

### Example 2:

![alt text](https://assets.leetcode.com/uploads/2021/02/19/symtree2.jpg "Image 2")

Input: root = [1,2,2,null,3,null,3]\
Output: false

### Constraints:

- The number of nodes in the tree is in the range [1, 1000].
- -100 <= Node.val <= 100

### Pseudocode:

Use recursion with overloaded method
1. Create overloaded method with left and right parameters
2. Recursion needs exit condition checking if left or right node is null returning they are equal
3. Check if left value is not equal to right value to return false
4. Return method with arguments moving node to the left and right 2 times
5. And the method with arguments moving node to opposite children
6. In original method check if root is null returning true
7. If not null then return overloaded method