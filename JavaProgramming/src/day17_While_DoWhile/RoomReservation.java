package day17_While_DoWhile;


import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room ?");
        String respond = scan.next().toLowerCase();

        if(respond.equals("yes")){
            System.out.println("Which room do you want to reserve King Bed / Queen Bed / single Bed ");
            scan.next();
            String roomType = scan.nextLine().toLowerCase();
            if(roomType.equals("king bad")){
                System.out.println("Your total price is $120" );
            }else if(roomType.equals("queen bed")){
                System.out.println("Your total price is $100" );
            }else if(roomType.equals("single bed")){
                System.out.println("Your total price is $80" );
            }else {

                while (!(roomType.equals("king bad") || roomType.equals("queen bed") ||
                        roomType.equals("single bed"))) {
                    System.err.println("Invalid entry, please re-enter ");
                    System.out.println("Which room do you want to reserve King Bed / Queen Bed / single Bed ");
                    scan.next();
                    roomType = scan.nextLine().toLowerCase();
                    if (roomType.equals("king bad")) {
                        System.out.println("Your total price is $120");
                        break;
                    } else if (roomType.equals("queen bed")) {
                        System.out.println("Your total price is $100");
                        break;
                    } else {
                        System.out.println("Your total price is $80");
                        break;


                    }


                }


            }
        }if(respond.equals("no")){
            System.out.println("Have a nice day");

        }if(!(respond.equals("no")||respond.equals("yes"))){

            while(!(respond.equals("yes") || respond.equals("no"))){
                System.err.println("Invalid entry, please re-enter");
                System.out.println("Do you want to reserve a room ?");
                respond = scan.next().toLowerCase();

                if(respond.equals("no")){
                    System.out.println("Have a nice day");
                    break;
                }
                if(respond.equals("yes")){
                    System.out.println("Which room do you want to reserve King Bed / Queen Bed / single Bed ");
                    scan.next();
                    String roomType = scan.nextLine().toLowerCase();
                    if(roomType.equals("king bad")){
                        System.out.println("Your total price is $120" );
                    }else if(roomType.equals("queen bed")){
                        System.out.println("Your total price is $100" );
                    }else if(roomType.equals("single bed")){
                        System.out.println("Your total price is $80" );
                    }else {

                        while (!(roomType.equals("king bad") || roomType.equals("queen bed") ||
                                roomType.equals("single bed"))) {
                            System.err.println("Invalid entry, please re-enter ");
                            System.out.println("Which room do you want to reserve King Bed / Queen Bed / single Bed ");
                            scan.next();
                            roomType = scan.nextLine().toLowerCase();
                            if (roomType.equals("king bed")) {
                                System.out.println("Your total price is $120");
                                break;
                            } else if (roomType.equals("queen bed")) {
                                System.out.println("Your total price is $100");
                                break;
                            } else {
                                System.out.println("Your total price is $80");
                                break;


                            }


                        }
                    }




                }

            }

        }


    }
}
/*
5. Create a class called RommReservation, write a program for the room reservation,
your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user wants to reserve.
if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no)
    			ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user
             provides a valid entry)
 */