package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Multiply2PositiveNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num1 = scan.nextInt();
        System.out.println("Enter another number :");
        int num2 = scan.nextInt();

        int result = 0;
        if (num1 < 0 || num2 < 0) {
            System.out.println("Invalid ");
        } else {

                for (int i = 1; i <= num1; i++) {
                    result += num2;
                }

            System.out.println(result);
            scan.close();

                }

            }


        }


/*
3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200

 */