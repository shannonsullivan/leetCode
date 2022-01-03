## 234. Palindrome Linked List
Given the head of a singly linked list, return true if it is a palindrome.

### Example 1:
![alt text][image1]

[image1]: https://assets.leetcode.com/uploads/2021/03/03/pal1linked-list.jpg "Image 1"
Input: head = [1,2,2,1]\
Output: true

### Example 2:
![alt text][image2]

[image2]: https://assets.leetcode.com/uploads/2021/03/03/pal2linked-list.jpg "Image 2"
Input: head = [1,2]\
Output: false

### Constraints:
- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

### Pseudocode:
Use two pointer technique with slow and fast pointer. Find the middle of list, 
split in half and reverse and reverse one half. Then compare each half.
1. Find the middle of list and split into two lists
2. Initialize slow and fast pointer both to head
3. While the fast next node and the one following are not null
4. Set the slow pointer to the next node and the fast pointer to the node after next
5. If the fast pointer doesn't equal null
6. Set slow pointer to the next node
7. Now that the list is split, reverse one half
8. Initialize a reverse head to the reverse method starting with the slow pointer
9. While the reverse head node doesn't equal null
10. Compare if head node value and reverse head node value are not equal and return false
11. Else assign the next reverse head to the reverse head node
12. Assign next head to the head node and return true
13. Create reverse method
14. Initialize previous list node to null
15. While head isn't null
16. Initialize next to next head
17. Assign previous node to head node
18. Assign head to previous
19. Assign next node to head
20. Return previous
