package day08_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2011;

        boolean isLeapYear = year % 4 == 0;

        if(isLeapYear){
            System.out.println(year + " is a leap Year");
        }
        if(!isLeapYear){
            System.out.println(year + " is not a leap Year");
        }


    }
}
