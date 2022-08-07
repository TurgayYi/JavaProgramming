package day16_ForLoopStringPractice;

import java.util.Scanner;

public class JavaFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String jv = "Java";

        int frequency = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            String temp = "" + str.charAt(i) + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i + 3);

            if(jv.equals(temp)){
             frequency++;

         }

            }
           System.out.println(frequency);


        }
    }
/*
4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */