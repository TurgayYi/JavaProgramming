package day18_NestedLoop.day20_Arrays;

import java.util.Arrays;

public class ReverseIntegers {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int[] reversedArray = new int[array.length];

        for (int i = 0,j=array.length-1; i < array.length ; i++,j--) {

           reversedArray[i] = array[j];


        }

        System.out.println(Arrays.toString(reversedArray));


    }
}
/*
	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */