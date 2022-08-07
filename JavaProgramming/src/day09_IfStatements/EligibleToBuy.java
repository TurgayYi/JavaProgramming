package day09_IfStatements;

public class EligibleToBuy {

    public static void main(String[] args) {
        int age = 23;
        String name = "Ali";

        if(age >=21){
            System.out.println(name + " is eligible to buy alcohol");
        }
        else{
            System.out.println(name + " is not eligible to buy alcohol");
        }

    }
}
