package week15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number : ");
            int num = scanner.nextInt();
            System.out.println("you entered num = " + num);
        }catch (InputMismatchException e){
            System.err.println("You entered an invalid value");
        }finally {
            scanner.close();
            System.out.println("Finally blocks always run except for that 3 conditions");
        }


    }
}
