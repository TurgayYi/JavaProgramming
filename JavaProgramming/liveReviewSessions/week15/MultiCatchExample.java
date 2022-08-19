package week15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

    public static void main(String[] args) {

        System.out.println("Enter an integer number greater than zero");
        int x = 5;
        Scanner scanner = new Scanner(System.in);
        try {

            int y = scanner.nextInt();
            System.out.println(x / y);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (InputMismatchException i){
            i.printStackTrace();
        }

        System.out.println("How are you");
        System.out.println("Some more lines of codes");




    }



}
