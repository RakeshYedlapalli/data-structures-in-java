package com.java.datastructures.datastrcturesalgorithmspractice.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] ints = {4,1,10,24,11,20,14,9};
//        selectionSort(ints);
        selectionSortByMe(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            // Find the index of the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the minimum element with the first unsorted element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }


    public static void selectionSortByMe(int[] selectionSort) {

        for (int i = 0; i < selectionSort.length; i++) {
            int maxValueIndex = 0;
            for (int j = 0; j < selectionSort.length - i - 1; j++) {

                if (selectionSort[maxValueIndex] < selectionSort[j + 1]) {
                    maxValueIndex = j + 1;
                }

            }
            int temp = selectionSort[selectionSort.length - i - 1];
            selectionSort[selectionSort.length - i - 1] = selectionSort[maxValueIndex];
            selectionSort[maxValueIndex] = temp;
        }

        for(int k=0;k<selectionSort.length;k++) {
            System.out.print(selectionSort[k]+" ");
        }
    }

}
