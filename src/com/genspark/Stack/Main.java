package com.genspark.Stack;


public class Main {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
