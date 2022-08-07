package day17_While_DoWhile;

import java.util.Scanner;

public class DividePositiveNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number");
        int num2 = scan.nextInt();

        while(!(num1 >= num2 && (num1 > 0 && num2 > 0))){
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Enter the first number");
            num1 = scan.nextInt();

            System.err.println("Enter the second number");
            num2 = scan.nextInt();

        }

        int count = 0;

        while(num1 >= num2){
            num1 = num1-num2;
            count ++;


        }

        System.out.println("Division = " + count + " Remainder = " + num1 );

    }
}
/*
1. Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.
 */