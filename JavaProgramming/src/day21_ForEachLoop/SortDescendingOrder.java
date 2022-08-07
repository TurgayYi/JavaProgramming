package day21_ForEachLoop;

import java.util.Arrays;

public class SortDescendingOrder {

    public static void main(String[] args) {

        int[] arr1 = {10, 2, 5, 45, -9, 0, -23};
        Arrays.sort(arr1);

        int[] arr2 = new int[arr1.length];

        int i = arr1.length-1;
        for (int each : arr1) {

            arr2[i--] = each;


        }

        System.out.println(Arrays.toString(arr2));



    }
}
/*
1. Write a program that sort the array of integer in descending order
 */