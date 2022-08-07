package day18_NestedLoop.day20_Arrays;

import java.util.Arrays;

public class Numbers100To1 {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0, j= 100; i < numbers.length && j >=1; i++,j--) {

            numbers[i] =j;

        }
        System.out.println(Arrays.toString(numbers));






    }

}
/*
2. create an array that has the numbers 100 to 1
 */