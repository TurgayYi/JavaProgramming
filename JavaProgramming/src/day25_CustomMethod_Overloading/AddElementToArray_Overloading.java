package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray_Overloading {

    public static void main(String[] args) {

        char[] array1 = "semih".toCharArray();
         array1 = addElement(array1,'7');

         int[] array2 = {1,2,3,4,5};
         array2 = addElement(array2,6);

         String[] array3 = "I love java".split(" ");
         array3 = addElement(array3,"much");

         double[] array4 = {3.4,5.09,6.7,8.902};
         array4 = addElement(array4,4.5678);


        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));





    }


    //adds the  given element to array, returns a new array
    public static int[] addElement(int[] array, int element){

        int[] newArray = new int[array.length+1];
        int i =0;
        for (int each : array) {
            newArray[i] =each;
            i++;
        }
        newArray[i] = element;

        return newArray;
    }

   //adds the  given element to array, returns a new array
    public static double[] addElement(double[] array, double element){

        double[] newArray = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[i] = element;


        return newArray;
    }

    //adds the  given element to array, returns a new array

    public static String[] addElement(String[] array, String element){

        String[] newArray = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[i] = element;


        return newArray;
    }

    //adds the  given element to array, returns a new array

    public static char[] addElement(char[] array, char element){

        char[] newArray = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[i] = element;


        return newArray;
    }




}
