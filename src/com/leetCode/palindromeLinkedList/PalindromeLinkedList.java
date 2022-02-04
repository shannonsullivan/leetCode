package com.leetCode.palindromeLinkedList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverseHead = reverse(slow);

        while (reverseHead != null && head != null) {
            if (reverseHead.val != head.val) {
                return false;
            } else {
                reverseHead = reverseHead.next;
                head = head.next;
            }
        }
        return true;
    }

    private ListNode reverse(ListNode head) {

        ListNode previous = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }
}
