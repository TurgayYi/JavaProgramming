package day15_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word :");

        String str = scan.nextLine();


        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reverse += str.charAt(i);

        }
        System.out.println(str.toLowerCase().equals(reverse.toLowerCase()));

        scan.close();

        }




    }

/*

	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
 */