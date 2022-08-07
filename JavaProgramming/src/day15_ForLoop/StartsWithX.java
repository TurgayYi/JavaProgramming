package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word :");

        String word = new Scanner(System.in).next();

        word = word.replaceFirst("x","a").toLowerCase();

        System.out.println(word);


    }

}
/*
Warmup tasks:
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodeX
                    Output:
                        acodex

 */