package day42_Exceptions;

public class ThrowsKeyword2 {
    public static void main(String[] args) {

        //throws keyword can not handle unchecked exceptions
        System.out.println("Test started");

        try {
            System.out.println(9/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }


        System.out.println("Test completed");


    }


}
