package day27_WrapperClasses;

import java.util.Arrays;

public class SwapTask {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        arr = swap(arr,2,4);

        System.out.println(Arrays.toString(arr));


        String[] arr1 = {"Ayse", "Fatma", "Hayriye","Angelica"};

        arr1 = swap(arr1,1,3);

        System.out.println(Arrays.toString(arr1));



    }



    // swaps the element at index i with the element at index j, and returns the new array
    public static int[] swap(int[] array, int i, int j){

        int a = array[i];
        int b =  array[j];

        int[] result = Arrays.copyOf(array,array.length);

        result[i] = b;
        result[j] = a;

        return result;


    }


    // swaps the element at index i with the element at index j, and returns the new array
    public static double[] swap(double[] array, int i, int j){

        double a = array[i];
        double b =  array[j];

        double[] result = Arrays.copyOf(array,array.length);

        result[i] = b;
        result[j] = a;

        return result;


    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static char[] swap(char[] array, int i, int j){

        char a = array[i];
        char b =  array[j];

        char[] result = Arrays.copyOf(array,array.length);

        result[i] = b;
        result[j] = a;

        return result;


    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static String[] swap(String[] array, int i, int j){

        String a = array[i];
        String b =  array[j];

        String[] result = Arrays.copyOf(array,array.length);

        result[i] = b;
        result[j] = a;

        return result;


    }


}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
	 the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array


 */