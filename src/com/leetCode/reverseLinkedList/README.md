## 206. Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

### Example 1:

![alt text](https://assets.leetcode.com/uploads/2021/02/19/rev1ex1.jpg "Image 1")

Input: head = [1,2,3,4,5]\
Output: [5,4,3,2,1]

### Example 2:

![alt text](https://assets.leetcode.com/uploads/2021/02/19/rev1ex2.jpg "Image 2")

Input: head = [1,2]\
Output: [2,1]

### Example 3:

Input: head = []\
Output: []

### Constraints:

- The number of nodes in the list is the range [0, 5000].
- -5000 <= Node.val <= 5000

### Pseudocode:

Iterative approach
1. Initialize previous node to null
2. Initialize current node to input head node
3. While current node isn't null
4. Initialize temp next node to next node current node is pointing at
5. This will hold the next node where we can change the pointer
6. Reassign previous node to next current node (This will reverse link)
7. Previous node will always be reassigned to current next node
8. Assign current to previous
9. Assign temp next to current node
10. Return previous

Recursive approach
1. Create helper method to reverse list and call itself
2. In helper method create break condition if head equals null return new head
3. Initialize temp next node to next head
4. Current link is broken in list by assigning new head to next head
5. Set next head to new head
6. Assign head to new head
7. Assign temp next to head
8. Return method with both parameters as arguments
9. Return recursive function in original method with head and null arguments