package com.genspark.Recursion;

public class MergeSort {

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int sizeOfAnLeftArray = mid - left + 1;
        int sizeOfAnRightArray = right - mid;

        int[] leftArray = new int[sizeOfAnLeftArray];
        int[] rightArray = new int[sizeOfAnRightArray];

        for (int iterator = 0; iterator < sizeOfAnLeftArray; ++iterator) {
            leftArray[iterator] = array[left + iterator];
        }

        for (int jterator = 0; jterator < sizeOfAnRightArray; ++jterator) {
            rightArray[jterator] = array[mid + 1 + jterator];
        }

        int leftIndex = 0, rightIndex = 0;
        int mergedIndex = left;

        while (leftIndex < sizeOfAnLeftArray && rightIndex < sizeOfAnRightArray) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[mergedIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[mergedIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }

        while (leftIndex < sizeOfAnLeftArray) {
            array[mergedIndex] = leftArray[leftIndex];
            leftIndex++;
            mergedIndex++;
        }

        while (rightIndex < sizeOfAnRightArray) {
            array[mergedIndex] = rightArray[rightIndex];
            rightIndex++;
            mergedIndex++;
        }

    }

    public static void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}
