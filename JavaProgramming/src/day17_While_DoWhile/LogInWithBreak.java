package day17_While_DoWhile;

import java.util.Scanner;

public class LogInWithBreak {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "Cydeo";
        String password = "Cydeo123";

        System.out.println("Enter your username");
        String user = scan.next();

        System.out.println("Enter your password");
        String pass = scan.next();

        if(user.equals(username)&& pass.equals(password)){
            System.out.println("Logged in.");
        }else{
            int count = 0;
            for (int i = 3; i > 0 ; i--) {
                System.err.println("YOU HAVE " + i + " ATTEMPTS LEFT ");
                System.err.println("Enter your username");
                user = scan.next();

                System.err.println("Enter your password");
                pass = scan.next();

                if(user.equals(username)&&pass.equals(password)){
                    System.out.println("Logged in");
                    break;
                }
                count ++;

            }if(count == 3){
                System.err.println("Your account is locked");
            }



        }






    }



}
/*
2. You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user
                to have three attempts to enter correct credentials and if all three attempts are failed,
                then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}


 */