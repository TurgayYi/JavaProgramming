package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        String reversed = "";
        boolean isPalindrome = false;

        for (int i = word.length()-1; i >=0 ; i--) {

            reversed += word.charAt(i);

        }
        if(word.equalsIgnoreCase(reversed)){
            isPalindrome = true;
        }
        System.out.println(isPalindrome);

    }
}
