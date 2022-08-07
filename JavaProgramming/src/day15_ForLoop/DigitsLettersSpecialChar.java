package day15_ForLoop;

import java.util.Scanner;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string :");
        String word = scan.next();

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i) >= '0' && word.charAt(i)<= '9'){
                digits += word.charAt(i);

            }else if((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') ||(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')  ){
                letters += word.charAt(i);
            }else{
                specialChars += word.charAt(i);
            }


        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

        scan.close();



    }

}
/*
   5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */