package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2  = {5,6};

        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0, j= arr1.length-1; i < arr1.length; i++, j++) {

            arr3[i] = arr1[i];

        }

        for (int i = 0, j = arr1.length; i < arr2.length; i++,j++) {

            arr3[j] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));


        System.out.println("-----------------------------------------");

        String[] group1 = {"Ali", "Layan", "Aysenur"};
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            students[i] = each; //students[i++] = each;
            i++;
        }
        for (String each : group2) {
            students[i] =each;
            i++;
        }

        System.out.println(Arrays.toString(students));


        System.out.println("------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int j = 0;
        for (char c : ch1) {
            chars[j++] = c;

        }
        for (char c : ch2) {
            chars[j++] = c;

        }

        System.out.println(Arrays.toString(chars));
    }
}
/*
Task
  1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}

 */