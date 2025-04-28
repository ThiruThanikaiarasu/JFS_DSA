package com.genspark.Queue;

public class Queue {
    LinkedList ds;

    public Queue() {
        ds = new LinkedList();
    }

    void enqueue(int data) {
        ds.addElementAtEnd(data);
    }

    void dequeue() {
        if (!ds.isEmpty()) {
            ds.skipElement();
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    int peek() {
        return ds.getFirstElementOfTheList();
    }

    boolean isEmpty() {
        return ds.isEmpty();
    }
}
