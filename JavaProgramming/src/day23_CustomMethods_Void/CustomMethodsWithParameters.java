package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {


    public static void main(String[] args) {

        evenOrOdd(5);

        System.out.println("---------------------");

        ageOfThePerson(1977);

        System.out.println("---------------------");

        printNumbers(10,20);

    }

    // create a function that can check if a number is odd number or even number
    public static void evenOrOdd(int num){

        if (num%2==0){
            System.out.println(num + " is an even number.");
        }else{
            System.out.println(num + " is an odd number. ");
        }

    }

    // create a function that can display the age of the person

    public static void ageOfThePerson(int birthYear){

        System.out.println("Age of the person = " + (2022-birthYear));

    }


    public static void printNumbers(int num1, int num2){

        for (int i = num1; i <= num2; i++) {

            System.out.print(i + " ");

        }

    }





}
