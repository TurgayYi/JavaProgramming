package day18_NestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

        String str = scan.next();

        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            String ch = ""+str.charAt(i);

            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                String ch1 = "" + str.charAt(j);
                if(ch.equals(ch1)){
                    frequency ++;

                }

                }

            if( !(result.contains(ch))){

                result += ch ;
                result += frequency;


            }


        }


        System.out.println(result);




    }

}
/*
4. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character,
             then repeat it for all the remaining characters

 */