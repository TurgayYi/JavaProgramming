package day23_CustomMethods_Void;

import java.util.Arrays;

public class TasksDay23 {

    public static void main(String[] args) {

        odd1To100();
        even1To100();
        eligibleForAlcohol(22);
        eligibleToVote(18,"usa");
        gradeCalculator(23);
        areaOfCircle(2.5);
        areaOfSquare(2.3);
        dollarToEuro(23);
        dollarToLira(500);
        kgToLb(73);
        positiveNegative(0);
        printEachChar("I have to go");
        int[] arr = {1,2,3};
        printEachElement(arr );
        calculator(4,45,'/');

        String[] name = {"cydeo", "SCHOOL"};
        fullName(name);

        anagram("listen","silent");


    }

   // 1. create a method that can print odd numbers between 1~100 in a same line saperated by space

    public static void odd1To100 (){

        String result = "";
        for (int i = 1; i <=100 ; i++) {

            if(i % 2 != 0){
                result+= i+" ";
            }

        }
        System.out.println(result);

    }

    // 2. create a method that can print even numbers between 1~100 in a same line saperated by space

    public static void even1To100(){

        for (int i = 1; i <= 100; i++) {

            if(i % 2 == 0){
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    //3. create a method that can check if a person is eligible to buy alcohol

    public static void eligibleForAlcohol(int age){
        if(age>=21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.err.println("Too young to buy an alcohol");
        }
    }

    //	4. create a method that can check if a person is eligible to vote
    //			Ex:
    //				eligibleToVote(19, "USA");
    //
    //			output:
    //				You are not eligible to vote!

    public static void eligibleToVote(int age, String citizenship){

        if(age >= 18 && citizenship.equalsIgnoreCase("USA")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }

    }

    //5. create a method that can calculate the grade of the student based on the score

    public static void gradeCalculator(int grade){
        char result = ' ';
        if(grade <=100 && grade>=0){

            if(grade >= 90){
                result= 'A';
            } else if (grade >= 80) {
                result = 'B';
            }else if (grade >= 70) {
                result = 'C';
            }else if (grade >= 60) {
                result = 'D';
            }else {
                result = 'F';
            }
            System.out.println(result);

        }else {
            System.err.println("Invalid grade");
        }

    }

    //6. create a method that can calculate the area of a circle

    public static void areaOfCircle(double radius){

        double area = 3.14 * radius*radius;
        System.out.println(area);

    }


    //7. create a method that can calculate the area of a square

    public static void areaOfSquare(double length){
        System.out.println("Area of the square = "+length*length);

    }

    //9. create a method that can convert dollar to euro

    public static void dollarToEuro(double dollar){

        System.out.println(dollar + "$ = " + dollar * 1.1 + " Euro");

    }

    //10. create a method that can can convert dollar to lira

    public static void dollarToLira(double dollar){

        System.out.println(dollar + "$ = " + dollar*16.73 + " TL");

    }

    //11. create a method that can convert kg to lb
    public static void kgToLb(int kg){

        System.out.println(kg + " kg = " + kg* 2.20  + " lb");

    }

    //12. create a method that can if the given integer is positive, negative or zero

    public static void positiveNegative(int number){

        if(number > 0){
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        }else{
            System.out.println(number + " is zero");
        }

    }

    //13. create a method named printEachChar that can print each characters of a string

    public static void printEachChar(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            result+=str.charAt(i) + " ";

        }
        System.out.println(result);


    }

    //14. create a method named printEachElement that can print each elements of an integer array

    public static void printEachElement(int[] arr){

        for (int each : arr) {

            System.out.print(each + " ");

        }
        System.out.println();
    }

    //15. create a method named calculator
    // that passes three arguments (num1, num2, mathOperator), prints the calculation result

    public static void calculator(int num1, double num2, char operator ){
        if(operator=='+'){
            System.out.println(num1 + " + " + num2 + " = " + num1+num2);
        }else if(operator=='-'){
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        }else if(operator=='*'){
            System.out.println(num1 + " * " + num2 + " = " + num1*num2);
        }else if(operator=='/'){
            System.out.println(num1 + " / " + num2 + " = " + num1/num2);
        }else{
            System.out.println("Invalid operator");
        }

    }

/*
	16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
 */

    public static void fullName(String [] name){
        String result = "";
        for (String each : name) {

                result+= each.substring(0,1).toUpperCase() + each.substring(1).toLowerCase() + " ";

        }

        System.out.println(result);

    }

  /*
      17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
   */

    public static void anagram(String word1,String word2){

        String result = "";
        for (int i = 0; i < word1.length(); i++) {

            for (int j = 0; j < word2.length(); j++) {

                if(word1.charAt(i) == word2.charAt(j)){
                    result+=word1.charAt(i);

                }

            }

        }
        if(result.equalsIgnoreCase(word1)){

            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }





    }








