package com.java.datastructures.datastrcturesalgorithmspractice.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] ints = {87, 342, 510, 156, 729, 22, 633, 418, 901, 47};
//        optimizedBubbleSort(ints);
        mySorting(ints);
        System.out.println(Arrays.toString(ints));
    }

    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }


    public static void mySorting(int[] sortingData) {


        for(int i=0;i<sortingData.length;i++) {

            for(int j=0;j<sortingData.length-i-1;j++) {

                if(sortingData[j] > sortingData[j+1]) {
                    int temp = sortingData[j+1];
                    sortingData[j+1] = sortingData[j];
                    sortingData[j] = temp;
                }
            }

            System.out.println();
            for(int k=0;k<sortingData.length;k++) {
                System.out.print(sortingData[k]+" ");
            }
        }


    }

}
