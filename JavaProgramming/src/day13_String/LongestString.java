package day13_String;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str1 = scan.nextLine();

        System.out.println("Enter another string :");
        String str2 = scan.nextLine();

        if(str1.length() > str2.length()){
            System.out.println("Longest string is : " + str1);
        }else{
            System.out.println("Longest string is : " + str2);
        }

    scan.close();

    }
}
/*
2. write a program that asks user to enter two strings, and print out the longest string

 */