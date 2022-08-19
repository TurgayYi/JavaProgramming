package week15.customException;

public class CustomExceptionTest {

    public static void main(String[] args) {
        int minute = 45;

        System.out.println("Oscar is talking about  " + minute + " minutes");

        if(minute > 50){
            throw new BreakTimeException("Hey Oscar when is the break Time");
        }

        System.out.println("Oscar will continue another " + (50-minute) + " minutes");



        double balance = 395.50;
        double itemPrice = 500.0;

        System.out.println("I have " + balance + " Euros  in my account, and item is " + itemPrice + " Euros");

        if (itemPrice> balance){
            throw new InsufficientBalanceException("Invalid balance");
        }



    }

}
