package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26]; //Z~A
/*
        alphabets[0] ='Z'; //90-ascii table
        alphabets[1] = 'Y';//89
        alphabets[2] ='X'; //88
        .....

 */

        char ch = 'Z';

        for (int i = 0; i < alphabets.length; i++) { //for (int i = 0; i < alphabets.length; i++,ch--)

            alphabets[i] =ch;
            ch --;

        }


        //System.out.println(alphabets);// gives hashcode

        System.out.println(Arrays.toString(alphabets));// prints the whole array
        //System.out.println(alphabets[0]); // prints the element of the array

        System.out.println("----------------------------------------------");

        for (char i = 0, j = 'A'; i < alphabets.length && j >='A' ; i++, j--) {

            alphabets[i] = j;

        }

        System.out.println(Arrays.toString(alphabets));

    }

}
