package day02_HelloWorld.day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        /*
        int score = 100;

        if(score >= 0 && score <= 100){ // if the score is valid 0-100

            if(score >=90){
                System.out.println("Excellent");
            }
            else if(score >=80 && score <=89){
                System.out.println("Great");
            }
            else if(score >=70 && score <=79){
                System.out.println("Good");
            }
            else if(score >=60 && score <=69){
                System.out.println("Passed");
            }
            else {
                System.out.println("Failed");
            }
        }
        else{
            System.out.println("Invalid Score");
        }
         */
        int score = 156;

        String result = (score >= 0 && score <= 100) ?
                (score >=90)? "Excellent" :(score >=80 && score <=89)? "Great"
                :(score >=70 && score <=79)? "Good" :(score >=60 && score <=69)? "Passed" : "Failed"
                : "Invalid Score";

        System.out.println("result = " + result);

        System.out.println("-----------------------------------");
        // Solution 3

        String result2 = "";

        if(score >= 0 && score <= 100){

            result2 = (score >=90)? "Excellent" :(score >=80 && score <=89)? "Great"
                    :(score >=70 && score <=79)? "Good" :(score >=60 && score <=69)? "Passed"
                    : "Failed";

        }else{
            System.out.println("Invalid Score");
        }



    }



}
