package com.genspark.Queue;

public class LinkedList {
    ListNode head;
    ListNode tail;

    LinkedList() {
        head = null;
        tail = null;
    }

    void addElementAtEnd(int data) { // Enqueue
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.setNext(newNode);
        tail = newNode;
    }

    boolean isEmpty() {
        return head == null;
    }

    void skipElement() { // Dequeue
        if (head != null) {
            head = head.getNext();
            if (head == null) { // Important! If queue becomes empty, reset tail
                tail = null;
            }
        }
    }

    int getFirstElementOfTheList() {
        if (head == null) {
            throw new RuntimeException("Queue is empty");
        }
        return head.getData();
    }
}
