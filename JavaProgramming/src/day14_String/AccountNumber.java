package day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static <string> void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Create an account number");
        String accountNumber = scan.next();

        String result = "";

        if(accountNumber.startsWith("2") || accountNumber.startsWith("5")){
            if(accountNumber.startsWith("2")){
                if(accountNumber.length() == 7){
                    result = accountNumber;
                }else {
                    result = "Invalid account number";
                }

                }else{
                if(accountNumber.length()==10){
                    result = accountNumber;
                }else {
                    result = "Invalid account number";

                    }

            }


        }else{
            result = "Invalid account number";
        }

        System.out.println(result);

        scan.close();


/*
public class AccountNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your account number");
        String accountNumber = input.next();
        if((accountNumber.charAt(0)=='2' && accountNumber.length()==7) || (accountNumber.charAt(0)=='5' && accountNumber.length() == 10)) {
            System.out.println("Valid account Number ");
        } else {
            System.out.println("Invalid account number");
        }
 */



    }
}
/*
   6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”

 */