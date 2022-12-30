package day27_WrapperClasses;

import day42_Exceptions.utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,12,2,33,34,4,4,5,5,56};

        arr = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

        String[] arr2 =  {"Ali", "Ali","Ayse","Ayse","Fatma","Hayriye"};

        arr2 = removeDuplicates(arr2);
        System.out.println(Arrays.toString(arr2));


    }

    // removes duplicated elements and returns new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};
        for (int each : array) {
            if( !ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    // removes duplicated elements and returns new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};
        for (String each : array) {
            if( !ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    // removes duplicated elements and returns new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};
        for (double each : array) {
            if( !ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }

    // removes duplicated elements and returns new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};
        for (char each : array) {
            if( !ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }

        return result;
    }



}