package day18_NestedLoop.day20_Arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {


        int [] arr = {1,0,2,0,3,0,0,4,5,6,7};

        int [] move = new int[arr.length];
                    //1,2,3
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != 0){

                move [j] = arr[i];
                j++;

            }

        }


        System.out.println(Arrays.toString(move));














/*
        int[] array = {10, 0, 5, 0, 1, 0};
        int[] movedZeros = new int[array.length];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                movedZeros[count] =array[i];
                count++;
            }



        }


        System.out.println(Arrays.toString(movedZeros));


 */
    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */