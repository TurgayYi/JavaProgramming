package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int[] reversed = new int[array.length];

        for (int i = array.length - 1, j=0; i >= 0 && j < array.length; i--,j++) {

            array[i] = reversed[j];


        }



        System.out.println(Arrays.toString(reversed));


    }
}
/*

	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */