package day19_LoopPractices;

import java.util.Scanner;

public class FirstDuplicated {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);

                if(ch ==ch1){
                    count++;
                }


                }

            if( (!(result.contains(""+ch))) && count>=2){

                result +=""+ch;
                result +=count;

            }

            }

        System.out.println(result.substring(0,2));

        }



        }

/*
1. Write a program that can return the first duplicated character from a string
 */


