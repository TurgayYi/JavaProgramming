package day24_CustomMethod_Return;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 5;

        int[] removed = removeElement(array,index);

        System.out.println(Arrays.toString(removed));

    }


    public static int[] removeElement(int[] array, int index){

        int[] arrayRemovedElement = new int[array.length-1];

        for (int i = 0; i < array.length; i++) {

            if(i < index){
                arrayRemovedElement[i] = array[i];
            } else if (i==index) {
                continue;
            }else{
                arrayRemovedElement[i-1]= array[i];
            }


        }



        return arrayRemovedElement;
    }




}
/*

	10. create a method named removeElement that passes one integer array and one integer,
	the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}

 */