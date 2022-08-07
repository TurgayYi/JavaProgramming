package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        boolean isLeapYear = year % 4 == 0;

        if(isLeapYear){
            System.out.println("Year " + year + " is leap year");
        }
        else{
            System.out.println("Year " +year + " is not leap year");
        }

    }
}
