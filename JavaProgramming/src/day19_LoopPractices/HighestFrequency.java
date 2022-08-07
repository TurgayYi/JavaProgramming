package day19_LoopPractices;

import java.util.Scanner;

public class HighestFrequency {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        char chMax = ' ';
        int highestFreq = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch ==each){
                    count++;
                }

            }
            if(count > highestFreq){
                chMax = ch;
                highestFreq = count;

            }

        }
        System.out.println("" + chMax + highestFreq);


    }
}
/*
Write a program that can find the character that has the highest frequency from a string
 */