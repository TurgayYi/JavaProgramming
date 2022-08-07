package day26_CustomMethpdsPractise;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int[] numbers = {100,200,300,400,500};
        numbers = removeElements(numbers,1);

        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------");

        String[] names = {"Ayse", "Fatma","Hayriye"};
        names = removeElements(names,2);

        System.out.println(Arrays.toString(names));


    }

    // removes the index from the array, returns new array
    public static int[] removeElements(int[] array, int index){


        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }
        int[] result = new int[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if(i==index){
                continue; // if the index of the array is matching with the element at given index
            }
            result[j] = array[i];
            j++;
        }


        return result;
    }


    // removes the index from the array, returns new array
    public static double[] removeElements(double[] array, int index){


        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }
        double[] result = new double[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if(i==index){
                continue; // if the index of the array is matching with the element at given index
            }
            result[j] = array[i];
            j++;
        }


        return result;
    }


    // removes the index from the array, returns new array
    public static char[] removeElements(char[] array, int index){


        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }
        char[] result = new char[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if(i==index){
                continue; // if the index of the array is matching with the element at given index
            }
            result[j] = array[i];
            j++;
        }


        return result;
    }


    // removes the index from the array, returns new array
    public static String[] removeElements(String[] array, int index){


        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index : " + index);
            System.exit(0);
        }
        String[] result = new String[array.length-1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if(i==index){
                continue; // if the index of the array is matching with the element at given index
            }
            result[j] = array[i];
            j++;
        }


        return result;
    }





}
/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index.
			the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index.
			 the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index.
			the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index.
			the method removes the element at the given index of the array and returns the new array




 */