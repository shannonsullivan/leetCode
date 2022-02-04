## 234. Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome.

### Example 1:

![alt text](https://assets.leetcode.com/uploads/2021/03/03/pal1linked-list.jpg "Image 1")
Input: head = [1,2,2,1]\
Output: true

### Example 2:

![alt text](https://assets.leetcode.com/uploads/2021/03/03/pal2linked-list.jpg "Image 2")

Input: head = [1,2]\
Output: false

### Constraints:

- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

### Pseudocode:

Use two pointer technique with slow and fast pointer. Find the middle of list, 
split in half and reverse one half. Then compare each half.
1. Find the middle of list and split into two lists
2. Initialize slow and fast pointer both to head
3. While the fast next node and the one following are not null
4. Set the slow pointer to the next node and the fast pointer to the node after next
5. Now that the list is split, reverse one half
6. Initialize a reverse head to the reverse method starting with the slow pointer
7. While the reverse head node and head node doesn't equal null
8. Compare if head node value and reverse head node value are not equal and return false
9. Else assign the next reverse head to the reverse head node
10. Assign next head to the head node and return true
11. Create reverse method
12. Initialize previous list node to null
13. While head isn't null
14. Initialize next to next head
15. Assign previous node to head node
16. Assign head to previous
17. Assign next node to head
18. Return previous
