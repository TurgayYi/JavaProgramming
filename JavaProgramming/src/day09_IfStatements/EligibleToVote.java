package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        int age = 11;
        String name = "Ali";
         if(age >=18){
             System.out.println(name + " is eligible to vote");
         }
        else{
             System.out.println(name + " is not eligible to vote");
         }

    }
}
