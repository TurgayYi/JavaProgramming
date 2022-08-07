package day16_ForLoopStringPractice;

import java.util.Locale;
import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();

        int numDog = 0;
        int numCat = 0;
        for (int i = 0; i < str.length()-2 ; i++) {

            String temp = ""+str.charAt(i)+str.charAt(i+1)+str.charAt(i+2);

            if(temp.equalsIgnoreCase("dog")){
                numDog ++;
            }if(temp.equalsIgnoreCase("cat")){
                numCat++;
            }

        }

        System.out.println(numCat==numDog);

    }
}
/*
5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */