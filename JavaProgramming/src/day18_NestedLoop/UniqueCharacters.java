package day18_NestedLoop;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";



        for (int i = 0; i < str.length(); i++) {
           String ch = "" + str.charAt(i);

            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                String ch1 = "" + str.charAt(j);

                if(ch.equals(ch1)){
                    frequency ++;
                }


            }
            if(frequency==1){
                System.out.println(str.charAt(i) + " is unique");
            }

        }








    }

}
/*
5. Write a program that can find the unique characters from a string without using index()
 and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character,
             then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

 */