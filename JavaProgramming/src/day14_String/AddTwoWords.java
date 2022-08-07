package day14_String;

import java.util.Scanner;

public class AddTwoWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word1 = scan.next();

        System.out.println("Enter another word :");
        String word2 = scan.next();

        String last1 = word1.substring(word1.length()-1);
        String first2 = word2.substring(0,1);

        if(last1.equals(first2)){
            System.out.println(word1 + word2.substring(1));
        }else{
            System.out.println(word1 + word2);
        }
        scan.close();



    }

}
/*
4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */