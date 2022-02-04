package com.leetCode.reverseLinkedList;

public class RecursiveReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        return reverse(head, null);
    }

    private ListNode reverse(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;

        ListNode tempNext = head.next;
        head.next = newHead;
        newHead = head;
        head = tempNext;

        return reverse(head, newHead);
    }
}
