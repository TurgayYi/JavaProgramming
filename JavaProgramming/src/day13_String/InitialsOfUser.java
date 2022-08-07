package day13_String;

import java.util.Scanner;

public class InitialsOfUser {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name :");
        String firstName = scan.next();

        System.out.println("Enter your last name :");
        String lastName = scan.next();

        char first = firstName.charAt(0);
        char last = lastName.charAt(0);

        String initials = ""+first + "." +last;
        initials = initials.toUpperCase();

        System.out.println(initials);

        scan.close();



    }
}
/*
4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */