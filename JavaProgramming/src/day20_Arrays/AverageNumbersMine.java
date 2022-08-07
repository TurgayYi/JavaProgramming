package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbersMine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int times = scan.nextInt();
        
        int[] numbers = new int[times];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            sum+=numbers[i];
            
            
        }
        
        double average = sum / numbers.length;

        System.out.println(Arrays.toString(numbers));
        System.out.println("average = " + average);



    }
}
/*
	4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */