package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String result = "";

        for (int i = 0; i < word.length() ; i++) {

            char ch = word.charAt(i);
            if(word.indexOf(ch) == word.lastIndexOf(ch)){//if the first and last index number of the character is same, then the character is unique
                result +=ch;
            }

        }
        System.out.println(result);
        scan.close();
                
    }
}
/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2

 */