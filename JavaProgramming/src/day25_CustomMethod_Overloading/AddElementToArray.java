package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4};

        int[] newArray =addInteger(array,5);

        System.out.println(Arrays.toString(newArray));

        System.out.println("----------------------------------------");

        double[] arr2 = {1.5,2.5,3.5,4.5};



        arr2 =  addDouble(arr2,5.5);
        System.out.println(Arrays.toString(arr2));

        System.out.println("------------------------------------------");

        String [] names ={"Tatiana", "Oleksandr","Cassandra","Ali"};

        names = addString(names,"Neira");
        names = addString(names,"Semih");

        System.out.println(Arrays.toString(names));

        System.out.println("-------------------------------------");

        char[] chr = "Semih".toCharArray();

        chr = addChar(chr,'7');

        System.out.println(Arrays.toString(chr));

    }

//1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addInteger(int[] array, int element){

        int[] newArray = new int[array.length+1];
        int i =0;
        for (int each : array) {
            newArray[i] =each;
            i++;
        }
        newArray[i] = element;

        return newArray;
    }

//	    2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addDouble(double[] array, double element){

        double[] newArray = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[i] = element;


       return newArray;
    }

//	    3. create a return method called addString that can add a String after the last index of a String array

    public static String[] addString(String[] array, String element){

        String[] newArray = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            newArray[i] = each;
            i++;
        }

        newArray[i] = element;


        return newArray;
    }

//	    4. create a return method called addChar that can add a char after last index of a char array

    public static char[] addChar(char[] array, char element){

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
/*
Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array

 */