package day17_While_DoWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println("Enter your gender");
        char gender = scan.next().toLowerCase().charAt(0);

        while(!(gender == 'f' || gender == 'm')){

            System.out.println("Invalid entry, please re-enter");
            System.out.println("Enter your gender");
            gender = scan.next().charAt(0);
        }

        System.out.println("Are you married? Yes/No");
        String married = scan.next().toLowerCase();

        while(!(married.equals("yes")|| married.equals("no"))){

            System.out.println("Invalid entry, please re-enter");
            System.out.println("Are you married? Yes/No");
            married = scan.next().toLowerCase();
        }

        System.out.println("Enter your age");
        int age = scan.nextInt();

        while(age < 0 || age > 120){

            System.out.println("Invalid entry, please re-enter");
            System.out.println("Enter your age");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive in a day?");
        int miles = scan.nextInt();

        while (miles < 5){

            System.out.println("Invalid entry, please re-enter");
            System.out.println("How many miles do you drive in a day?");
            miles = scan.nextInt();
        }


        System.out.println("Which insurance do you prefer, full coverage or liability");
        scan.next();
        String insuranceType = scan.nextLine().toLowerCase();

        while(!(insuranceType.equals("full coverage") || insuranceType.equals("liability"))){

            System.out.println("Invalid entry, please re-enter");
            System.out.println("Which insurance do you prefer, full coverage or liability");
            insuranceType = scan.nextLine().toLowerCase();

        }

        System.out.println("Did you have any accidents or claims in past five years?, Yes/No");
        String accident = scan.next().toLowerCase();

        while (!(accident.equals("yes")|| accident.equals("no"))){

            System.out.println("Invalid entry, please re-enter");
            System.out.println("Did you have any accidents or claims in past five years?, Yes/No");
            accident = scan.next().toLowerCase();

        }

        System.out.println("Does your car have an anti-theft device, Yes/No");
        String device = scan.next().toLowerCase();

        while(!(device.equals("yes") || device.equals("no"))){

            System.out.println("Invalid entry, please re-enter");
            System.out.println("Does your car have an anti-theft device, Yes/No");
            device = scan.next().toLowerCase();
        }

        double result = 0;

        if(insuranceType.equals("liability")){
            if(age<25){
                result += 90;
            }else {
                result += 50;
            }
            if(miles<=10){
                result += 10;
            } else if (miles > 10 && miles <=50) {
                result += 30;
            }else{
                result += 50;
            }

        }else{

            if(age<25){
                result += 160;
            }else {
                result += 1200;
            }
            if(miles<=10){
                result += 20;
            } else if (miles > 10 && miles <=50) {
                result += 40;
            }else{
                result += 70;
            }

        }

        if(device.equals("yes")){
            result *= 0.95;
        }
        if(accident.equals("yes")){
            result *= 1.15;
        }else{
            result *= 0.90;
        }
        if(married.equals("yes")){
            result *= 0.95;
        }

        System.out.println("Here is your bill " + result);

    }
}
/*
 6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount


 */