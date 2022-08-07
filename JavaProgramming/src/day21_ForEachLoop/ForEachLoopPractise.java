package day21_ForEachLoop;

public class ForEachLoopPractise {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School","Wooden Spoon", "Angry Birds"};


        for (String word : words) {
            String str = "" + word.charAt(0) + word.charAt(word.length()-1);
            System.out.println(str);

            }




        }


    }

