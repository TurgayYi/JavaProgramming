package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};

        int[] merged = merger(arr1,arr2);
        System.out.println(Arrays.toString(merged));

        System.out.println("------------------------");

        String[] names1 = {"Ayse","Fatma","Hayriye"};
        String[] names2 ={"Semih", "Azra"};

        String[] names = merger(names1,names2);

        System.out.println(Arrays.toString(names));



    }

    public static int[] merger(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];

        }
        for (int i = 0, j = arr1.length; i < arr2.length; i++) {
            merged[j] = arr2[i];
            j++;
        }

        return merged;
    }

    public static double[] merger(double[] arr1, double[] arr2){

        double[] merged = new double[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];

        }
        for (int i = 0, j = arr1.length; i < arr2.length; i++) {
            merged[j] = arr2[i];
            j++;
        }

        return merged;
    }

    public static char[] merger(char[] arr1, char[] arr2){

        char[] merged = new char[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];

        }
        for (int i = 0, j = arr1.length; i < arr2.length; i++) {
            merged[j] = arr2[i];
            j++;
        }

        return merged;
    }

    public static String[] merger(String[] arr1, String[] arr2){

        String[] merged = new String[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];

        }
        for (int i = 0, j = arr1.length; i < arr2.length; i++) {
            merged[j] = arr2[i];
            j++;
        }

        return merged;
    }
    
    



}
