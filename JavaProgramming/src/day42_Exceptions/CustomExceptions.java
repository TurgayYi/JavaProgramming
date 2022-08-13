package day42_Exceptions;

class FadyException extends RuntimeException{ // custom unchecked Exception

    public FadyException(){
        super("Time for short break");
    }

    public FadyException(String message){
       super(message);
    }

}

class NoBreakException extends Exception{ // custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args)  {
       // throw new FadyException("Time for lunch break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }

}
