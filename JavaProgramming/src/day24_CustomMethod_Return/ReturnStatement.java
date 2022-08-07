package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfDay(1);
    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){
        String name = "";
        if(number < 1 || number> 7){ // if the number is invalid
            return;// return exits nameOfDay method
        }
        name= (number==1)? "Monday" :(number==2)?  "Tuesday":(number==3)? "Wednesday":(number==4)?
                "Thursday":(number==5)? "Friday":(number==6)? "Saturday" : "Sunday" ;

        System.out.println(name);



    }


}
