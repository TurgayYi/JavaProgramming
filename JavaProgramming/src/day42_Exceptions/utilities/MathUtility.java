package day42_Exceptions.utilities;

public class MathUtility {

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
