package day17_While_DoWhile;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


            int sum = 0;
        while(true){
            
            System.out.println("Enter a positive number or Zero ");
            int num = scan.nextInt();
            if(num >= 0){
                sum+=num;  
            }else{
                System.err.println("You entered a negative number");
                break;
                        
            }

        }
        System.out.println("sum = " + sum);
        scan.close();

    }
}
/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop
 */