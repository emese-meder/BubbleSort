package com.sparta.em.engineering50.javabasics;

public class ArrayPrint {

    //method to print arrays as strings
    public String arrayPrint(int[] array){
        String arrayAsString="";
        for(int k = 0; k <array.length ;k++) {
            arrayAsString +=  (array[k] + " " );
        }
        return arrayAsString;
    }
}
