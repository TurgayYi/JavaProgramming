package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReturnReversedArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        int[] reversedNumbers = reversedArray(numbers);

        System.out.println(Arrays.toString(reversedNumbers));

    }

    public static int[] reversedArray(int[] numbers){

        int[] reversedArray = new int[numbers.length];

        for (int i = numbers.length - 1, j= 0; i >= 0; i--, j++) {

            reversedArray[j] =numbers[i];

        }


        return reversedArray;
    }

}
/*
{1,2,3,4,5} === > {5,4,3,2,1}
 */