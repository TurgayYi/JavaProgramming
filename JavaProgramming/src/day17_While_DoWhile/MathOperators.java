package day17_While_DoWhile;

import java.util.Scanner;

public class MathOperators {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        double num1 = scan.nextInt();

        System.out.println("Enter another number");
        double num2 = scan.nextInt();

        String add = "+",
                min = "-",
                mul = "*",
                div = "/";
        System.out.println("Enter a math operator");
        String operator = scan.next();

        if (operator.equals(add)) {
            System.out.println(num1 + num2);
        } else if (operator.equals(min)) {
            System.out.println(num1 - num2);
        } else if (operator.equals(mul)) {
            System.out.println(num1 * num2);
        } else if (operator.equals(div)) {
            System.out.println(num1 / num2);
        } else {

            while (!(operator.equals(add) || operator.equals(add) || operator.equals(add) || operator.equals(add))) {
                System.err.println("Invalid operator, please re-enter");

                System.out.println("Enter a valid math operator");
                operator = scan.next();
                if (operator.equals(add)) {
                    System.out.println(num1 + num2);
                    break;
                }
                if (operator.equals(min)) {
                    System.out.println(num1 - num2);
                    break;
                }
                if (operator.equals(mul)) {
                    System.out.println(num1 * num2);
                    break;
                }
                if (operator.equals(div)) {
                    System.out.println(num1 / num2);
                    break;

                }


            }


        }

    }
}
/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator
		 until user provides a valid operator (+, -, *, /)

 */