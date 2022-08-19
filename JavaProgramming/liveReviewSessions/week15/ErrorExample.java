package week15;

public class ErrorExample {

    public static void main(String[] args) {
        try {
            deathlyMethod();
        }catch (StackOverflowError error){
            System.out.println(error.getCause());
            System.out.println(error.getMessage());
        }
        System.out.println("Codes after Error executed or NOT");

    }

    static int counter = 0;

    public static void deathlyMethod(){
        System.out.println(counter++);
        deathlyMethod();
    }

}
