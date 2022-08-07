package day13_String;

import java.util.Scanner;

public class FirstAndLastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence :");

        String sentence = scan.nextLine();
        char f = sentence.charAt(0);
        char l = sentence.charAt(sentence.length()-1);

        System.out.println("First character = " + f + ", Last character = " + l);

        scan.close();




    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */