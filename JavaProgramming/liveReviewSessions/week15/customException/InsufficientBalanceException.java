package week15.customException;

public class InsufficientBalanceException extends RuntimeException{

   public InsufficientBalanceException(String message){
      super(message);
   }



}
