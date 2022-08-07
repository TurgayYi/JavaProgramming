package day15_ForLoop;

public class ReplaceX {
    public static void main(String[] args) {
        String word = "xcodeX";

        word = word.toLowerCase().replace("x","a");
        System.out.println(word);


    }


}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */