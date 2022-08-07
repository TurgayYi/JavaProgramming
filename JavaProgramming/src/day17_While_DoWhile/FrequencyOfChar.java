package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        String str = scan.nextLine();
        String ch = scan.next();
        
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
             String ch1 = ""+ str.charAt(i);
             if(ch.equals(ch1)){
                 frequency += 1;
             }
            

            
        }

        System.out.println("frequency = " + frequency);


        System.out.println("--------------------------------");
        
        String str1 = "AAABBBC";
        
        char ch1 = 'A';
        
        int frequency1 = 0;

        for (int i = 0; i < str1.length(); i++) {

            char eachChar = str1.charAt(i);

            if(ch1 == eachChar){
                frequency1++;

            }
            
        }
        System.out.println("frequency1 = " + frequency1);
        
    }
    

}
/*
warmup tasks:
	1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */