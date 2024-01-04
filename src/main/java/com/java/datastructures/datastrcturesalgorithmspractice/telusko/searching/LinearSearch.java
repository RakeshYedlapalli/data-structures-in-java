package com.java.datastructures.datastrcturesalgorithmspractice.telusko.searching;

public class LinearSearch {

    public static void main(String[] args) {



        int [] listOfUnsortedData = {5,19,93,83,92,992,93,393};

        int target = 393;

        System.out.println(getIndexOfGivenSearchElement(listOfUnsortedData, target));
    }

    private static int getIndexOfGivenSearchElement(int[] listOfUnsortedData, int target) {

        for(int i = 0; i< listOfUnsortedData.length; i++) {
            if(listOfUnsortedData[i] == target) {
               return i;
            }
        }
        return -1;
    }
}
