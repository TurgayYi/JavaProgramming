package day14_String;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word1 = scan.next();

        System.out.println("Enter another word :");
        String word2 = scan.next();

        System.out.println(word1.substring(1) + word2.substring(1));

        scan.close();

    }



}
/*
1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */