package day13_String;

import java.util.Scanner;
public class CybertekApp {

    public static void main(String[] args) {

        String userName = "Cydeo",
                passWord = "WoodenSpoon";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username :");
        String userName1 = scan.next();

        System.out.println("Enter your password :");
        String passWord1 = scan.next();


        if(userName.equals(userName1) && passWord.equals(passWord1)){
            System.out.println("Logged in.");
        }else{
            System.out.println("Incorrect username or password");
        }

        scan.close();



    }

}
/*
8. You are writing a code for the log-in function of the Cybertek Application,
 assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched,
        your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method


 */