package day20_Arrays;

import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println( "How many numbers would you like to enter");
        int times = scan.nextInt();

        int[] numbers = new int[times];

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();

            sum += numbers[i];


        }
        double avarageNumber =  sum/ numbers.length;
        System.out.println("avarageNumber = " + avarageNumber);
        scan.close();


    }
}
