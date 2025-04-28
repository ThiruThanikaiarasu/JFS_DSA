package com.genspark.Stack;

public class LinkedList {
    ListNode head;

    LinkedList() {
        head = null;
    }

    LinkedList(int data) {
        head = new ListNode(data);
    }

    void addElementAtHeadPosition(int data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    boolean isEmpty() {
        return head == null;
    }

    void skipElement() {
        if (head != null) {
            head = head.getNext();
        }
    }

    int getFirstElementOfTheList() {
        if(head == null) {
            System.out.println("List is empty");
        }
        return head.getData();
    }

}
