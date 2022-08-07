package day13_String;

import java.util.Objects;
import java.util.Scanner;

public class IsFirstLastCharSame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = scan.nextLine();

        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);

        System.out.println(first == last);


        scan.close();

    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */