package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {

    // pre-condition : if there is only one statement in the block
    public static void main(String[] args) {

        int number = 9;
        String monthName = ""; //temporary ==>local variables

        if(number>=1 && number <=12)
            if(number == 1)
                monthName = "January";
            else if(number == 2)
                monthName = "February";
            else if(number == 3)
                monthName = "March";
            else if(number == 4)
                monthName = "April";
            else if(number == 5)
                monthName = "May";
            else if(number == 6)
                monthName = "June";
            else if(number == 7)
                monthName = "July";
            else if(number == 8)
                monthName = "August";
            else if(number == 9)
                monthName = "September";
            else if(number == 10)
                monthName = "October";
            else if(number == 11)
                monthName = "November";
            else
                monthName = "December";


        else
            monthName ="Invalid number";


        System.out.println("monthName = " + monthName);


    }
}
