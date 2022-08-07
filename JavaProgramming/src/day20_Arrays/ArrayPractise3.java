package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractise3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter");
        int times = scan.nextInt();//length of the array

        if(times <=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[times];

        for (int i = 0; i < times; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();
            numbers[i] = number;

            //numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();
    }
}
