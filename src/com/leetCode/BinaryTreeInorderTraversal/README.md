## 94. Binary Tree Inorder Traversal
Given the root of a binary tree, return the inorder traversal of its nodes' values.

### Example 1:
![alt text][image1]

[image1]: https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg "Image 1"

Input: root = [1,null,2,3]\
Output: [1,3,2]

### Example 2:
Input: root = []\
Output: []

### Example 3:
Input: root = [1]\
Output: [1]

### Constraints:
- The number of nodes in the tree is in the range [0, 100].
- -100 <= Node.val <= 100

### Pseudocode:
Use recursion to return recursive method with root and a new list 
1. Create recursive method with root and list as parameters
2. Exit condition to check if root is null and return list
3. Traverse root node to left and assign to list
4. Add root node value to list
5. Return recursion method traversing root node to right

Use stack to travers tree iteratively
1. Instantiate new stack of TreeNodes
2. Instantiate new List of integers to return
3. While stack isn't empty or root isn't null
4. Traverse left side of tree first while checking root isn't null
5. Add root node to stack for temporary holding place
6. Traverse to left of root
7. Then remove root node from stack and assign back to root
8. Add root node to list 
9. Traverse to right of root
10. Return the list 