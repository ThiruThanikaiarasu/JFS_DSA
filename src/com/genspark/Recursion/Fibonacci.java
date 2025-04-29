package com.genspark.Recursion;

public class Fibonacci {
    public static int fibonacci(int n) {
        if(n <=1) {
            return n;                                      // for the base case
        }

        return fibonacci(n-1) + fibonacci(n-2);   // for rest of the cases

    }

    public static void main(String argos[]) {

        fibonacci(5);
    }

}
