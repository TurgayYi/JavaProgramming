package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();

        String fullName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(fullName);

        /*
        firstName= (""+ firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName =(""+lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(firstName + " " + lastName);

         */



    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */