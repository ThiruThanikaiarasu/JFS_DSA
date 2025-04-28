package com.genspark.Stack;


public class Stack {
    LinkedList ds;
    public Stack() {
        ds = new LinkedList();
    }

    void push(int data) {
        ds.addElementAtHeadPosition(data);
    }

    void pop() {
        if (!ds.isEmpty()) {
            ds.skipElement();
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    int peek() {
       return ds.getFirstElementOfTheList();
    }

    void isEmpty() {
        ds.isEmpty();
    }
}
