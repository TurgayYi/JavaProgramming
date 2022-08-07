package day09_IfStatements;

public class PassOrFailed {
    public static void main(String[] args) {
        int score = 75;
        boolean pass = score >= 60;

        if(pass){
            System.out.println("Congrats, you passed");

        }
        else{
            System.out.println("Failed");
        }

    }

}
