package day13_String;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 words :");

        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();

        int len1 = str1.length(),
                len2 = str2.length(),
                len3 = str3.length();
        String result = "";

        if(len1==len2 && len2 == len3){
            result = "All words are same length";
        }else if((len1 == len2 && len1 !=len3) || (len2 == len3 && len1 != len2)){
            result = "Not Same nor Different lengths";
        }else{
            result = "All different length";
        }

        System.out.println(result);

        scan.close();


    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */