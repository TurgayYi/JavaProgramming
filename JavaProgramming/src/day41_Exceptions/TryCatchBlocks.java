package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test started");

        try{
            System.out.println(9/0);
            System.out.println("Try Block");

        }catch (ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic exception was occurred");

        }



        System.out.println("Test Completed");






    }
}
