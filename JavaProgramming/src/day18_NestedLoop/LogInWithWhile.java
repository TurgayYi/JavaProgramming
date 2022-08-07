package day18_NestedLoop;

import java.util.Scanner;

public class LogInWithWhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = "Cydeo";
        String password = "WoodenSpoon";

        System.out.println("Enter your username");
        String user = scan.next();

        System.out.println("Enter your password");
        String pass = scan.next();

        if(userName.equals(user) && password.equals(pass) ){
            System.out.println("Logged in");
        }else{

            int count = 0;
            while (!(userName.equals(user) && password.equals(pass)) && count<3){

                System.out.println("Invalid entry, please re-enter");
                System.out.println("Enter your username");
                user = scan.next();

                System.out.println("Enter your password");
                pass = scan.next();

                count ++;

                if(userName.equals(user) && password.equals(pass)){
                    System.out.println("Logged in");
                    break;
                }



            }
            if(count == 3){
                System.out.println("Your account is locked");
            }

            scan.close();








        }







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