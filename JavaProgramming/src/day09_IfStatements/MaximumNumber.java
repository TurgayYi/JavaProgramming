package day09_IfStatements;

public class MaximumNumber {

    public static void main(String[] args) {

        int num1 = 21,
                num2 = 21;
        if(num1 > num2){
            System.out.println(num1 + " is the minimum number");

            }
        else if(num1 < num2){
            System.out.println(num2 + " is the minimum number");
        }
        else{
            System.out.println("Equal");
        }

    }
}
