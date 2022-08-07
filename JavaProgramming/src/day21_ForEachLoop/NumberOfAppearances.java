package day21_ForEachLoop;

public class NumberOfAppearances {


    public static void main(String[] args) {

        String[] sentences = {"I love Java and Python", "Java is fun, Python is easier","Spend more time on Java"};

        int countJava = 0;
        int countPython= 0;
        for (String each : sentences) {



            for (int i = 0; i < each.length()-3; i++) {

                if("Java".equals(each.substring(i,i+4)  ) ){

                    countJava++;

            }

            }

            for (int i = 0; i < each.length()-5; i++) {

                if("Python".equals(each.substring(i,i+6)  ) ){

                    countPython++;

                }

            }



        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }






}

/*
6. Write a program that can return the number of
appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)



 */