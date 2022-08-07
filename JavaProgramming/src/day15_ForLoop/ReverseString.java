package day15_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");

        String sentence = scan.nextLine();

        String reverse = "";

        for (int i = sentence.length()-1; i >= 0  ; i--) {
            reverse += sentence.charAt(i);

        }

        System.out.println("reverse = " + reverse);

        scan.close();




    }
}
/*
	7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */