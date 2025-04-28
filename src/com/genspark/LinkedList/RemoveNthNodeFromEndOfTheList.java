package com.genspark.LinkedList;

public class RemoveNthNodeFromEndOfTheList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.getNext();
        }

        if (fast == null) {
            return head.getNext();
        }

        while (fast.getNext() != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }

        slow.setNext(slow.getNext().getNext());

        return head;
    }
}
