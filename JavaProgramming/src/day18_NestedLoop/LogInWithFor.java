package day18_NestedLoop;

import java.util.Scanner;

public class LogInWithFor {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String username = "Cydeo";
        String password = "WoodenSpoon";

        System.out.println("Enter your username");
        String user = scan.next();

        System.out.println("Enter your password");
        String pass = scan.next();

        if(username.equals(user) && password.equals(pass)){
            System.out.println("Logged in");
        }else{

            for (int i = 1; i < 4; i++) {

                System.out.println("Incorrect username or password.Please re-enter.");
                System.out.println("Enter your username");
                user = scan.next();

                System.out.println("Enter your password");
                pass = scan.next();
                if(username.equals(user) && password.equals(pass)){
                    System.out.println("Logged in");
                    break;
                }


            }

            if(! (username.equals(user) && password.equals(pass))){

                System.err.println("Your account is locked, Please contact to the support team.");
            }

        }

        scan.close();


    }
}
/*
2. You are writing a code for the log-in function of the Cydeo Application,
  assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should
                        allow the user to have three attempts to enter correct credentials
                        and if all three attempts are failed, then print "Your account is locked."


 */