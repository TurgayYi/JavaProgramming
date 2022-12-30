package day27_WrapperClasses;

import day42_Exceptions.utilities.ArraysUtility;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int [] result = insert(arr,2,323);

        System.out.println(Arrays.toString(result));

        double[] arr1  = {1.3, 2.5, 6.7, 8.9};

        double[] result1 = insert(arr1,3, 34.5);
        System.out.println(Arrays.toString(result1));


        String[] arr2 = {"Ayse", "Fatma", "Hayriye", "Betty"};

        arr2 = insert(arr2,3, "Angelica");

        System.out.println(Arrays.toString(arr2));



    }


    //inserts the given element to the given index of the array and returns the new array
    public static int[] insert(int[] array, int index,int element){

        int [] arr1 = Arrays.copyOfRange(array,0,index);
        arr1 = ArraysUtility.addElement(arr1,element);
        int [] arr2 = Arrays.copyOfRange(array,index,array.length);

        int[] result = ArraysUtility.merge(arr1,arr2);

        return result;


    }

    // inserts the given element to the given index of the array and returns the new array
    public static double[] insert(double[] array, int index, double element){

        double[] arr1 = Arrays.copyOfRange(array,0,index);
        arr1 =ArraysUtility.addElement(arr1,element);

        double[] arr2 = Arrays.copyOfRange(array,index,array.length);

        double[] result = ArraysUtility.merge(arr1,arr2);

        return result;

    }

    // inserts the given element to the given index of the array and returns the new array
    public static char[] insert(char[] array, int index, char element){

        char[] arr1 = Arrays.copyOfRange(array,0,index);
        arr1 =ArraysUtility.addElement(arr1,element);

        char[] arr2 = Arrays.copyOfRange(array,index,array.length);

        char[] result = ArraysUtility.merge(arr1,arr2);

        return result;

    }

    // inserts the given element to the given index of the array and returns the new array
    public static String[] insert(String[] array, int index, String element){

        String[] arr1 = Arrays.copyOfRange(array,0,index);
        arr1 =ArraysUtility.addElement(arr1,element);

        String[] arr2 = Arrays.copyOfRange(array,index,array.length);

        String[] result = ArraysUtility.merge(arr1,arr2);

        return result;

    }












}
/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
		the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array


 */