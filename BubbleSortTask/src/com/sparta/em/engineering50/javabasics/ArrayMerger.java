package com.sparta.em.engineering50.javabasics;

public class ArrayMerger {

    //this method implements the simple merging of two arrays
    public static int[] mergeArrays(int[] array1, int[] array2){
        int length = array1.length + array2.length; //get combined array length
        int[] combinedArray = new int[length]; // create an empty array with combined length
        /*for each element of the new combined array fill with
        elements of the first then second sub-array then break*/
        for (int j : combinedArray){
            for (int i : array1){
                combinedArray[j] = i; //fill
                j++; //go to next element in combined
            }
            for (int k: array2){
                combinedArray[j] = k;//fill
                j++; //go to next element in combined
            }
            break;
        }
        return combinedArray;
    }
}
