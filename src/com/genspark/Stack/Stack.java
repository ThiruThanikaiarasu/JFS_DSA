package com.genspark.Stack;


import com.genspark.LinkedList.LinkedList;

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

    boolean isEmpty() {
        return ds.isEmpty();
    }
}
