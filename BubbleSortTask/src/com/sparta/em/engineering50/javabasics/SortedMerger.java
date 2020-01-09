package com.sparta.em.engineering50.javabasics;

public class SortedMerger {

    //this method implements combining the elements of two sorted arrays into a combined sorted array
    public int[] sortedMerge(int[] array1, int[] array2) {
        int length = array1.length + array2.length; //get combined array length
        int[] combinedArray = new int[length]; // create an empty array with combined length
        int arrayOnePointer = 0;
        int arrayTwoPointer = 0;
        int combinedArrayPointer = 0;

        //adding elements to the combined array
        while (arrayOnePointer < array1.length && arrayTwoPointer < array2.length) {
            if (array1[arrayOnePointer] <= array2[arrayTwoPointer]) {
                combinedArray[combinedArrayPointer++] = array1[arrayOnePointer++]; //add element then increment array1 and combined
            } else if (array2[arrayTwoPointer] < array1[arrayOnePointer]) {
                combinedArray[combinedArrayPointer++] = array2[arrayTwoPointer++]; //add element then increment array2 and combined
            }
        }
        //if the end of one of the arrays is reached, just add rest of the other array to the combined
        if (arrayOnePointer == array1.length) {
            while (arrayTwoPointer < array2.length) {
                combinedArray[combinedArrayPointer++] = array2[arrayTwoPointer++];
            }
        } else if (arrayTwoPointer == array2.length) {
            while (arrayOnePointer < array1.length) {
                combinedArray[combinedArrayPointer++] = array1[arrayOnePointer++];
            }
        }
        return combinedArray;

    }
}
