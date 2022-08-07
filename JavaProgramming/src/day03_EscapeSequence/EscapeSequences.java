package day03_EscapeSequence;
/*
escape sequences : MUST be given double quote
    \n: starts a new line
    \t: paragraph space(tab)
    \\: Causes a backslash to be printed
    \": double quote
 */

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython\nC#");

        System.out.println("------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week? ");

        System.out.println("---------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("--------------------------");

        System.out.println("/ \\");  // in order to print one backslash we need to give two backward slashes

        System.out.println("-----------------------------------");

        System.out.println("My favorite TV show is \"Game Of Thrones\"");  // in order t print double quotes, we need to use \"



    }


}
