package com.genspark.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.peek());

        queue.dequeue();

        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
