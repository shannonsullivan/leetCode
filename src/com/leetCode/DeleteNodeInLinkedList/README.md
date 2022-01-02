## 237. Delete Node in a Linked List

Write a function to **delete a node** in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to **the node to be deleted** directly.

It is **guaranteed** that the node to be deleted is **not a tail node** in the list.

### Example 1:
![alt text][image1]

[image1]: https://assets.leetcode.com/uploads/2020/09/01/node1.jpg "Image 1" 

Input: head = [4,5,1,9], node = 5\
Output: [4,1,9]\
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

### Example 2:
![alt text][image2]

[image2]: https://assets.leetcode.com/uploads/2020/09/01/node2.jpg "Image 2"

Input: head = [4,5,1,9], node = 1\
Output: [4,5,9]\
Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.

### Constraints:

- The number of the nodes in the given list is in the range [2, 1000].
- -1000 <= Node.val <= 1000
- The value of each node in the list is unique.
- The node to be deleted is in the list and is not a tail node

### Pseudocode:
Since we are not given access to the head node, we will 
override the value of the given node and break the link by 
reassigning the next node to 2 nodes (next, next) after input node.
1. Get the input value of node to be deleted and reassign value to the next node's value
2. Assign the value of 2 nodes ahead (next, next) to the input node's next value