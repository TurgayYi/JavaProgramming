package day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
        "API Testing", "Database Testing", "Manual Testing"};

        for (String each : names) {

            String initials = "" + each.charAt(0) + each.charAt(each.indexOf(" ")+1);
            System.out.println(initials);
            

        }



    }

}
