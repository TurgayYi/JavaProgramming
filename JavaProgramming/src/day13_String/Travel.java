package day13_String;


import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have a valid passport (Yes or No)");
        String yesNo = scan.next();

        if(yesNo.equals("Yes")){

            int baseCost = 1000;

            scan.nextLine();

            System.out.println("Enter the country you are traveling to :");
            String country = scan.nextLine();

            System.out.println("How many bags will you take with you?");
            byte numOfBags = scan.nextByte();
            baseCost += numOfBags * 50;

            System.out.println("How many people are you traveling with ?");
            short numOFPeople= scan.nextShort();

            if(numOFPeople >= 3){
                baseCost -= 300;
            }else{
                baseCost -= numOFPeople * 100;
            }

            scan.nextLine();

            System.out.println("Enter the names of the people(each separating with a coma )");
            String names = scan.nextLine();

            System.out.println("Your ticket is booked to " + country +".We have charged extra for the " + numOfBags +
                            " bags but you are traveling with " + names +
                            " so we are giving a discount. Your total cost is $" + baseCost + ".");


        }else{

            int passportRenewal = 200;

            System.out.println("When your passport expired");
            int expireYear = scan.nextInt();
            passportRenewal += (2022 - expireYear) * 75;

            scan.nextLine();

            System.out.println("Enter the country you are traveling to :");
            String country1 = scan.nextLine();

            System.out.println("Will you be travelling in the next year ? (Yes/No)");
            String nextYearTravel = scan.next();

            if(nextYearTravel.equals("Yes")){
                passportRenewal += 100;
            }else{
                passportRenewal -= 50;
            }

            System.out.println("Looks like your password has been expired for " + (2022-expireYear) +
                    " years,but not to worry we will get it ready for you to travel to " + country1 +
                      ". Your total cost has come out to $" + passportRenewal + ".");



        }

        scan.close();

    }
}
/*
3. Create a class calledTravel. Make a cost variable to calculate
how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line,
            		separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName.
            		We have charged extra for the $numberOfBags bags
            		but you are traveling with $peopleYouTravelWith so we are giving a discount.
            		Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years,
        			 but not to worry we will get it ready for you to travel to $allCountries.
        			  Your total cost has come out to $costAmount."

 */