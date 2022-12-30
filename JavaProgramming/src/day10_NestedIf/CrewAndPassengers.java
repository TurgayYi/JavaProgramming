package day10_NestedIf;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int total = 100;
        String text = "";

        if(total == 50 || total == 75 || total == 100){
            if(total ==50){
                text = "20 crew, 30 passengers";

            } else if(total== 75){
                text = "25 crew, 50 passengers";
            }else{
                text = "30 crew, 70 passengers";
            }


        }else{
            text = "not valid";
        }

        System.out.println(text);



    }
}
/*
2. Create a class called CrewAndPassangers,
Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */