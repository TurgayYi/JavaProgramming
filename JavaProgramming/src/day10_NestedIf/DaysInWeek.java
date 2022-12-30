package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int n =9;
        String day = "";
/*
        if(n ==1){
           day = "Monday";
        }
        else if(n==2){
            day = "tuesday";
        }
        else if(n==3){
            day = "Wednesday";
        }
        else if(n==4){
            day = "Thursday";
        }
        else if(n==5){
            day = "Friday";
        }
        else if(n==6){
            day = "Saturday";
        }
        else if(n ==7) {
            day = "Sunday";
        }
        else{
            day =  "Invalid";
        }
        System.out.println(day);

        */

        String result1 = (n ==1)? day = "Monday" :(n==2)? day = "tuesday" : (n==3)?  day = "Wednesday"
                            :(n==4)? day = "Thursday" :(n==5)? day = "Friday" :(n==6)? day = "saturday"
                            :(n==7)? day = "Sunday" : "Invalid Number";
        System.out.println("result1 = " + result1);

        System.out.println("----------------------------------------------------------");

        String result2= (n ==1)? "Monday" :(n==2)? "tuesday" : (n==3)? "Wednesday":(n==4)? "Thursday"
                        :(n==5)? "Friday" :(n==6)? "saturday" :(n==7)? "Sunday" : "Invalid Number";

        System.out.println("result2 = " + result2);







    }
}
