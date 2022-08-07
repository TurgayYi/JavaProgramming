package day17_While_DoWhile;

import java.util.Scanner;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();

        String divisibleBy15 = "",
                divisibleBy5 = "",
                divisibleBy3 = "";

        for (int i = 1; i <= num ; i++) {
            if(i % 15 == 0){
                divisibleBy15 += i + " ";
            }if (i % 5 == 0 && i % 3 != 0){
                divisibleBy5 += i + " ";
            }if (i % 3 == 0 && i % 5 != 0){
                divisibleBy3 += i + " ";
            }

        }
        System.out.println("Divisible By 15 : " + divisibleBy15);
        System.out.println("Divisible By 5 : " + divisibleBy5);
        System.out.println("Divisible By 3 : " + divisibleBy3);

        scan.close();
    }
}
