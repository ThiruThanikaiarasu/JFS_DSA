package com.genspark.LinkedList;

public class ListNode {
    private int data;
    private ListNode next;
    ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        if(data <  0) return;
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
