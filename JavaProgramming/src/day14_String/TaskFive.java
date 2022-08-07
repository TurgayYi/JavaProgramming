package day14_String;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word :");
        String word = scan.next();

        int firstChar = word.charAt(0);
        String result = "";

        if(firstChar >= 48 && firstChar <= 57){

            result = "first character is digit";
        }else if(firstChar >= 65 && firstChar <= 90){
            result = "first character is uppercase letter";
        }else if(firstChar >= 97 && firstChar <= 122){
            result = "first character is lowercase letter";
        }else{
            result = "first character is special character";
        }

        System.out.println(result);

        scan.close();




    }

}
/*
    5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
 */