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

    public static int printDecNumber(int n) {

        if(n < 0) {
            return 1;                         // for the base case
        }

        System.out.println(n);
        return printDecNumber(n -1);      // for all other cases
    }

    public static int printAscNumbers(int n) {
        if (n < 0) {
            return 1;             // base case
        }

        printAscNumbers(n - 1);       // first go down to 0
        System.out.println(n);
        return 1;// then print on the way back up
    }


    public static void main(String[] args) {
        printPattern(5);
    }
}
