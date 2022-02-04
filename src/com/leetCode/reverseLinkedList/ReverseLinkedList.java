package com.leetCode.reverseLinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {

            ListNode tempNext = current.next;
            current.next = previous;
            previous = current;
            current = tempNext;
        }
        return previous;
    }
}
