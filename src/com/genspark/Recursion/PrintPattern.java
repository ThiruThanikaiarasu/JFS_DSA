package com.genspark.Recursion;

public class PrintPattern {

    public static int printPattern(int n) {
        if(n < 1) {
            return 1;
        }

        printPattern(n - 1 );

        for(int iterator = 1; iterator <= n; iterator++) {
            System.out.print(iterator + " ");
        }
        System.out.println();

        return 1;
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
