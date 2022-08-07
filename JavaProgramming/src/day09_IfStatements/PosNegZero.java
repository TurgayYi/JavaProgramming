package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int num = 0;

        if(num > 0){
            System.out.println(num +" is a Positive number");
        }
        else if(num < 0){
            System.out.println(num + " is a Negative number");

        }
        else{
            System.out.println("Zero");
        }


    }

}
