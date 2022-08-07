package day27_WrapperClasses;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a password");
        String password = scan.next();


        if(password.length()<8){
            System.out.println("Password mut be at least 8 characters long");
            System.exit(0);
        }


        boolean space = false;
        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        boolean digit = false;


        boolean strong = true;

        for (char each : password.toCharArray()) {

            if(Character.isDigit(each)){
                digit = true;
            }
            if(Character.isUpperCase(each)){
                upper = true;
            }
            if(Character.isLowerCase(each)){
                lower = true;
            }
            if (!Character.isLetterOrDigit(each)){
                special = true;
            }
            if(each==' '){
                space = true;

            }

        }


        if(digit && upper && lower && special && !space){
            System.out.println("Strong password");
        }else{
            System.out.println("Not strong password");


        }



        }


    }



/*PasswordValidation:
        Write a program that can verify if a password is a strong password.
         Characteristics of strong passwords are:
        1. Password MUST be at least have 8 characters long, and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lower case letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit

 */