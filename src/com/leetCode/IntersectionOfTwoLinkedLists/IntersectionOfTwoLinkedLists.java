package com.leetCode.IntersectionOfTwoLinkedLists;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = pointerA != null ? pointerA.next : headB;
            pointerB = pointerB != null ? pointerB.next : headA;
        }
        return pointerA;
    }
}
