package day26_CustomMethpdsPractise;

public class Math {

    public static void main(String[] args) {

        int sum = sumOfTwoNumbers(1,2);
        System.out.println(sum);

        double sum2 = sumOfTwoNumbers(1.2,2.5);
        System.out.println(sum2);

        double result = subtraction(3.2,2.1);
        System.out.println(result);

        boolean result1 = isOdd(44);
        System.out.println(result1);

        System.out.println(minOfTwoNumbers(20.1,30.56));

        System.out.println(square(3.3));


    }

    // returns the sum of two numbers
    public static int sumOfTwoNumbers(int num1, int num2){
        return (num1 + num2);
    }

    // returns the sum of two numbers
    public static double sumOfTwoNumbers(double num1, double num2){
        return (num1 + num2);
    }



    // returns the subtraction of two numbers
    public static int subtraction(int num1, int num2){
        return num1-num2;
    }

    // returns the subtraction of two numbers
    public static double subtraction(double num1, double num2){
        return num1-num2;
    }


    // returns the subtraction of two numbers
    public static int multiplication(int num1, int num2){
        return num1*num2;
    }

    // returns the subtraction of two numbers
    public static double multiplication(double num1, double num2){
        return num1*num2;
    }

    //passes two double parameters and return the division result
    public static double division(double num1, double num2){
        return num1/num2;
    }


    //checks if an integer is even number

    public static boolean isEven(int num){
        return num%2==0;
    }

    //checks if an integer is odd number
    public static boolean isOdd(int num){
        return num%2 != 0;
    }


    // returns the maximum number between two integers

    public static int maxOfTwoNumbers(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    // returns the maximum number between two decimal numbers

    public static double maxOfTwoNumbers(double num1, double num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }




    // returns the minimum number between two integers
    public static int minOfTwoNumbers(int num1, int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }

    // returns the maximum number between two decimal numbers
    public static double minOfTwoNumbers(double num1, double num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }



    //returns the square of an integer
    public static int square(int num){
        return num*num;
    }

    //returns the square of a double
    public static double square(double num){
        return num*num;
    }



    //returns the cube of an integer
    public static int cube(int num){
        return num*num*num;
    }

    //returns the cube of a double
    public static double cube(double num){
        return num*num*num;
    }




}
/*
1. Create a class called MathUtility under the utility package:

			2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers

			2.3 Create a method that can return the subtraction of two integers
			2.4 Create a method that can return the subtraction of two decimals

			2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals

			2.7 Create a method that passes two double parameters and return the division reslt

			2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number

			2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers

			2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double


 */