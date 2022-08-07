package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {

    public static void main(String[] args) {


        //create a variable that is capable enough to contain 5 names

        String[] myGroup = new String[5];
        myGroup[0] ="Günay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";
        //myGroup[5] = "Muhtar";//Index 5 out of bounds for length 5 Exception in thread "main"


        //System.out.println(myGroup);//hashcode
        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------------------");

        String[] days = {"Monday", "Tuesday" , "wednesday" ,"Thursday" ,"Friday", "Saturday", "Sunday "};

        System.out.println(Arrays.toString(days));

        int num = 5;

        if(num<1 || num>7){
            System.err.println("Invalid Number");
            System.exit(0);

        }
        System.out.println(days[num-1]);

        System.out.println("----------------------------------------");


        String[] month = {"Jan", "Feb", "Mar","Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scan.nextInt();

        if(num<1 || num>12){

            System.err.println("Invalid entry");
            System.exit(0);
        }
        System.out.println(month[num1-1]);


    }
}
