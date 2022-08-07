package day15_ForLoop;


import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2147483647;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number :");
            int num = scan.nextInt();
            if (num < min){
                min = num;
            }

        }
        System.out.println("min = " + min);

        scan.close();


    }
}
/*
Ask user to enter a number 5 times and
return the minimum number
 */