package day18_NestedLoop.day20_Arrays;

import java.util.Arrays;

public class Numbers1To100 {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0, j=1; i < numbers.length && j<=100; i++, j++) {
            numbers[i] = j;


        }

        System.out.println(Arrays.toString(numbers));


    }
}
/*
1. create an array that has the numbers 1 to 100
 */