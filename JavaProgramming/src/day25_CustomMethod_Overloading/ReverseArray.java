package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr1 = {1,22,3,4,5,6};
        int[] r1 = reverse(arr1);

        System.out.println(Arrays.toString(r1));


        System.out.println("----------------");

        double[] arr2 = {2.3,4.5,6.7,8.9};
        double [] r2 = reverse(arr2);

        System.out.println(Arrays.toString(r2));

        System.out.println("----------------");

        char[] arr3 = {'A','G','B','1','3'};
        char[] r3 = reverse(arr3);

        System.out.println(Arrays.toString(r3));

        System.out.println("----------------");

        String[] arr4 = {"Ayse", "Fatma","Hayriye"};
        String[] r4 = reverse(arr4);

        System.out.println(Arrays.toString(r4));

        System.out.println("----------------");


    }


    public static int[] reverse(int[] array){
        int[] reversed = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }

        return reversed;
    }

    public static double[] reverse(double[] array){
        double[] reversed = new double[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }

        return reversed;
    }

    public static char[] reverse(char[] array){
        char[] reversed = new char[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }

        return reversed;
    }

    public static String[] reverse(String[] array){
        String[] reversed = new String[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[j] = array[i];
            j++;
        }

        return reversed;
    }
}
