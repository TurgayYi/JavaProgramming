package day18_NestedLoop.day20_Arrays;

import java.util.Arrays;

public class ArrayPractise2 {

    public static void main(String[] args) {

        char[] letters = new char[26];
/*
        letters[0] = 'A';
        letters[1] = [B];
        ....
 */
        for (char i = 'A', j=0; i <= 'Z' && j < letters.length ; i++, j++) {// i: index numbers 0 ~ last index

            letters[j] =i;

        }


        System.out.println(Arrays.toString(letters));//[A~Z]

        System.out.println("-------------------------------------");

        char ch = 'A';

        for (int i = 0; i < letters.length ; i++) {
            letters[i] = ch++;

        }
        System.out.println(Arrays.toString(letters));//[A~Z]

        System.out.println("------------------------------------------");

        char ch1 = 'A';

        for (int i = 0; i < letters.length ; i++, ch1++) {

            letters[i] =ch1;
        }

        System.out.println(Arrays.toString(letters));//[A~Z]

        System.out.println("----------------------------------------");

        char[] letters2 = new char[26]; // [Z ~ A]

        for (char i = 0, ch2 = 'Z'; i <letters2.length && ch2 >= 'A' ; i++, ch2--) {

            letters2[i] = ch2;


        }

        System.out.println(Arrays.toString(letters2));
    }
}
