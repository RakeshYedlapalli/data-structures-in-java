package com.java.datastructures.datastrcturesalgorithmspractice.telusko.searching;

public class BinarySearch {

    public static void main(String[] args) {


        int[] listOfUnsortedData = {5, 19, 83, 92, 93, 393, 992};

        int target = 88282;

        System.out.println("element found in index : " +
                binarySearch(listOfUnsortedData, target));
    }

    private static int binarySearch(int[] listOfUnsortedData, int target) {

        int left = 0;
        int right = listOfUnsortedData.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            if (listOfUnsortedData[mid] == target) {
                return mid;
            } else if (target > listOfUnsortedData[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
