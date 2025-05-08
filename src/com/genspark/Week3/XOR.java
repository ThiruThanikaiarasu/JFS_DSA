package com.genspark.Week3;

public class XOR {

    public static int findMaximumXor(int[] array) {
        int arraySize = array.length;
        int max = Integer.MIN_VALUE;
        for(int iterator =  0; iterator < arraySize; iterator++) {
            for(int jterator = iterator + 1; jterator < arraySize; jterator++) {
                int value = array[iterator] ^ array[jterator];
                max = value > max ? value : max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {7, 8, 9};

        System.out.println(findMaximumXor(array));
    }
}
