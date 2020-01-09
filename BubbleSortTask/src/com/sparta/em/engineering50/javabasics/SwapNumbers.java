package com.sparta.em.engineering50.javabasics;

import java.util.ArrayList;

//this method is not actually used in bubble sort directly, just it's logic
public class SwapNumbers {

    public void swap(int[] array) {
        int first = array[0];
        array[0] = array[1];
        array[1] = first;
    }

    public void swapTwo(int a, int b) {
        int spare = a;
        a = b;
        b = spare;
    }



}

