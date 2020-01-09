package com.sparta.em.engineering50.javabasics;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //create new arrays for input
        int[] intArray1 = new int[]{1, 3, 5, 7, 9, 23};
        int[] intArray2 = new int[]{2, 3, 4, 6, 7};
        int[] intArray3 = new int[]{2, 1, 4, 6, 4, 9};

        //for easy array printing
        ArrayPrint arrayPrint = new ArrayPrint();

        //Bubble sort:
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.bubbleSort(intArray3);
        System.out.println("The bubble sorted single array is: " + arrayPrint.arrayPrint(sortedArray));


        //array merge and then sort:
        ArrayMerger arrayMerger = new ArrayMerger();

        int[] combinedArray = ArrayMerger.mergeArrays(intArray1, intArray2);
        System.out.println("The two array combined but unsorted:" + arrayPrint.arrayPrint(combinedArray));


        int[] combinedSortedArray = bubbleSort.bubbleSort(combinedArray);
        System.out.println("The two array combined and then sorted:" + arrayPrint.arrayPrint(combinedSortedArray));
        //note: it is not the most efficient to sort the combined array


        //SortedMerger
        SortedMerger sortedMerger = new SortedMerger();
        int[] sortedMergedArray = sortedMerger.sortedMerge(intArray1, intArray2);
        System.out.println("The two arrays sorted while merging :" + arrayPrint.arrayPrint(sortedMergedArray));


    }
}