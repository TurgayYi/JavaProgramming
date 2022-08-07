package day09_IfStatements;

public class Calculator {
    public static void main(String[] args) {

        char mathOperator = '+';
        int num1 = 10,
                num2 = 20;

        if(mathOperator=='+'){
            System.out.println(num1 + num2);
        }
        else if(mathOperator == '-'){
            System.out.println(num1 - num2);
        }
        else if(mathOperator == '*'){
            System.out.println(num1 * num2);
        }
        else if(mathOperator == '/'){
            System.out.println(num1 / num2);
        }
        else{
            System.out.println("Invalid operator");
        }





    }

}
/*
2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */