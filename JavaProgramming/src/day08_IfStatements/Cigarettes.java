package day08_IfStatements;

public class Cigarettes {
    public static void main(String[] args) {

        byte age = 17;

        boolean isEligible = age >= 18;
        boolean notEligible = !isEligible;

        if(isEligible){
            System.out.println("Eligible to buy Cigarettes");

        }
        if(notEligible){
            System.out.println("Not eligible to buy Cigarettes");

        }

    }
}

/*
1. Given a number (byte) age, write a program that can
 check if the person is eligible to buy Cigarettes

 */
