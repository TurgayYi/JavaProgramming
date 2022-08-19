package week15;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Enter an integer number greater than zero");
        int x = 5;
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        try {
            System.out.println(x / y);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("How are you");
        System.out.println("Some more lines of codes");

    }

}
