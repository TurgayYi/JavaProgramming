package day15_ForLoop;

import java.util.Scanner;

public class SumWithFor {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum +=  i;


        }
        System.out.println(sum);

        System.out.println("-------------------------------------");

        Scanner scan = new Scanner(System.in);

        int total = 0;
        System.out.println("Enter 5 numbers :");

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number :");
            int num = scan.nextInt();
            total += num;

            // total +=scan.nextInt()

        }
        System.out.println(total);

        scan.close();
    }
}
/*
3. Write a program that can calculate the sum of all integers between 1 to 100
 */