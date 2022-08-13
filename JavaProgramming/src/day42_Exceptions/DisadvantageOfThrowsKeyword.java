package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) {
        System.out.println("Hello ");
       // sleep(3000); rises an exception because, handling exception with throws keyword is a temporary solution.If we call the method again the caller must handle the exception

        System.out.println("Hello world");

        System.out.println("---------------------------");

        System.out.println("Hello ");

        MorningWorkOut.sleep(3);// we handled the exception with try-catch(permanent )

        System.out.println("Cydeo");

    }




    public static void sleep(double seconds) throws InterruptedException { //custom method

            Thread.sleep((long)(seconds*1000));


    }

}
