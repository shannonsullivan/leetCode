## 141. Linked List Cycle
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

### Example 1:
![alt text][image1]

[image1]: https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png "Image 1"

Input: head = [3,2,0,-4], pos = 1\
Output: true\
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

### Example 2:
![alt text][image2]

[image2]: https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png "Image 2"

Input: head = [1,2], pos = 0\
Output: true\
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

### Example 3:
![alt text][image3]

[image3]: https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png "Image 3"

Input: head = [1], pos = -1\
Output: false\
Explanation: There is no cycle in the linked list.


### Constraints:

- The number of the nodes in the list is in the range [0, 104].
- -10&#8309; <= Node.val <= 10&#8309;
- pos is -1 or a valid index in the linked-list.

### Pseudocode:
Use cycle detection
1. Initialize slow list node to head
2. Initialize fast list node to head
3. While fast doesn't equal null and fast next doesn't equal null
4. Then set fast to equal fast next next
5. Set slow to equal slow next
6. If slow equals fast return true
7. Else return false