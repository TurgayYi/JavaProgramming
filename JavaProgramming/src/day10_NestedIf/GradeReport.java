package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

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

        System.out.println(("----------------------------"));

        String result = "";// temporary
        if(score >= 0 && score <= 100){ // if the score is valid 0-100

            if(score >=90){
                result = "Excellent";
            }
            else if(score >=80 && score <=89){
                result = "Great";
            }
            else if(score >=70 && score <=79){
                result = "Good" ;
            }
            else if(score >=60 && score <=69){
                result = "Passed";
            }
            else {
                result = "Failed";
            }
        }
        else{
            result = "Invalid Score";
        }
        System.out.println("result = " + result); // used only one print statement


    }
}
/*
90 - 100 : excellent
80 - 89 : Great
70 - 79 : Good
60 - 69 : Passed
0 - 59 :Failed


 */