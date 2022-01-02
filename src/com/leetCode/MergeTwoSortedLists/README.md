## 21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one **sorted** list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



### Example 1:
![alt text][image1]

[image1]: https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg "Image 1"

Input: list1 = [1,2,4], list2 = [1,3,4]\
Output: [1,1,2,3,4,4]

### Example 2:
Input: list1 = [], list2 = []\
Output: []

### Example 3:
Input: list1 = [], list2 = [0]\
Output: [0]


### Constraints:
- The number of nodes in both lists is in the range [0, 50].
- -100 <= Node.val <= 100
- Both list1 and list2 are sorted in **non-decreasing** order.

### Pseudocode:
Compare both list's nodes setting smaller node to new list. 
Advance each node in list setting all nodes to new list and return list.
1. Instantiate new temp list node with an argument of 0
2. Initialize current list to temp list
3. While input list A isn't null and input list B isn't null
4. If list A node value is less than list B node value
5. Set current next node equal to list A
6. Set list A equal to list A next node
7. Else set current next node equal to list B
8. Set list B equal to list B next node
9. Set current list equal to current next
10. Use ternary operator if list A is null
11. Then set current next to list A
12. Else set current next to list B
13. Return temp next