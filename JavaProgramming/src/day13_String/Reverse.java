package day13_String;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = scan.nextLine();

        int l = str.length();

        if(l == 5){

            System.out.println("" + str.charAt(4) + str.charAt(3) + str.charAt(2)+str.charAt(1)+str.charAt(0));

        } else if (l < 5 ) {
            System.out.println("Too short!");

        }else {
            System.out.println("Too long!");
        }

        scan.close();


    }


}
/*,
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

 */