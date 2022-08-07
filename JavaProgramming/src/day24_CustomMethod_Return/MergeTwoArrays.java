package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

       int[] arr1 = {1,2,3};
       int[] arr2 = {4,5};

       int[] mergedArray = mergeTwoArrays(arr1,arr2);

        System.out.println(Arrays.toString(mergedArray));



    }


    public static int[] mergeTwoArrays(int[] arr1, int arr2[]){

        int [] mergedArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {

            mergedArray[i] = arr1[i];

        }

        for (int i = 0, j= arr1.length; i < arr2.length; i++,j++) {

            mergedArray[j] = arr2[i];

        }



        return mergedArray;
    }




}

/*

	5. create a method that can merge two arrays and returnj the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}
 */
