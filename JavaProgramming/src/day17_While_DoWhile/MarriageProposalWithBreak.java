package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposalWithBreak {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = scan.next().toLowerCase();

        if(answer.equals("yes")){
            System.out.println("Congrats.");
        }else if(answer.equals("no")){
            System.out.println("Goodbye");
        }else{

            int count = 3;
            while(!((answer.equals("yes") || answer.equals("no"))) && count > 0){
                System.out.println("Will you marry me?");
                answer = scan.next();
                count--;

            }
            if(count == 0){
                System.err.println("Why don't you just say yes or no!");
            }else{
                if((answer.equals("yes"))){
                    System.out.println("Congrats");
                }else{
                    System.out.println("Good bye");
                }


            }


        }




    }




}
/*

	1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no

 */