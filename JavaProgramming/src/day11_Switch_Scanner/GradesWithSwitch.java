package day11_Switch_Scanner;

public class GradesWithSwitch {

    public static void main(String[] args) {

        char grade = 't';
        String text = "";

        switch(grade){

            case 'A' :
                text = "'A': excellent";
                break;
            case 'B' :
                text = "'B': great job";
                break;
            case 'C' :
                text = "'C': good";
                break;
            case 'D' :
                text = "'D': passed";
                break;
            case 'F' :
                text = "'F': failed";
                break;
            default:
                text = "Invalid";

        }

        System.out.println(text);
    }
}

/*
Create a class called Grade, a char variable named grade is given.
 write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE SwITCH. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */
