package com.genspark.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addNodeAtTheEndOfLinkedList(1);
        linkedList.addNodeAtTheEndOfLinkedList(2);
        linkedList.addNodeAtTheEndOfLinkedList(3);
        linkedList.addNodeAtTheEndOfLinkedList(4);
        linkedList.addNodeAtTheEndOfLinkedList(5);

        System.out.println("linked list:");
        linkedList.traverseTheLinkedList();

        System.out.println("After deleting the last node: ");
        linkedList.deleteLastNode();
        linkedList.traverseTheLinkedList();

        System.out.println("After deleting the 2nd element: ");
        linkedList.deleteNodeAtKthPosition(2);
        linkedList.traverseTheLinkedList();

        System.out.println("After deleting middle element: ");
        linkedList.deleteMiddleNode();
        linkedList.traverseTheLinkedList();
    }
}
