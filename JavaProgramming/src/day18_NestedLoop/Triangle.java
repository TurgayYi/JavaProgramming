package day18_NestedLoop;

public class Triangle {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 0; j < 1; j++) {

                System.out.println("* ".repeat(i));

            }

        }


    }


}
/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */