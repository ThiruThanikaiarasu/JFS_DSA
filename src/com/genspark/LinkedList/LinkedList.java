package com.genspark.LinkedList;

public class LinkedList {
    ListNode head;

    LinkedList() {
        head = null;
    }

    LinkedList(int data) {
        head = new ListNode(data);
    }

    void addNodeAtTheEndOfLinkedList(int data) {

        ListNode newNode = new ListNode(data);

        if(head == null) {
            head = newNode;
            return;
        }

        ListNode currentNode = head;
        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    void traverseTheLinkedList() {

        ListNode currentNode = head;

        while(currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    void deleteLastNode() {
        if(head == null) {
            return;
        }
        if(head.getNext() == null) {
            head = null;
            return;
        }

        ListNode currentNode = head;

        while (currentNode.getNext().getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(null);
    }

    void deleteNodeAtKthPosition(int k) {

        if (head == null || k < 0) {
            return;
        }

        if (k == 0) {
            head = head.getNext();
            return;
        }

        ListNode currentNode = head;
        ListNode previousNode = null;

        for (int i = 0; i < k; i++) {
            if (currentNode == null) {
                return;
            }

            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (currentNode == null) {
            return;
        }

        previousNode.setNext(currentNode.getNext());
    }

    void deleteMiddleNode() {
        if (head == null || head.getNext() == null) {
            head = null;
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode previousNode = null;

        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            previousNode = slow;
            slow = slow.getNext();
        }

        previousNode.setNext(slow.getNext());
    }

}
