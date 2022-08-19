package week15;

public class CheckedExceptionExample {

    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello after 5 seconds");

    }

}
