package day24_CustomMethod_Return;

public class ReturnMethodPractise4 {

    public static void main(String[] args) {

        String str = "aaabbcccc";

        String removedDuplicates = removeDuplicates(str);

        System.out.println(removedDuplicates);


    }

    public static String removeDuplicates(String str){
        String result = "";

        for (int i = 0; i < str.length() ; i++) {

            if (!(result.contains(""+str.charAt(i)))){
                result+=str.charAt(i);
            }


        }




        return result;
    }


}
/*
	1. create a method that can remove duplciated characters from a string and returns the new value
					"aaabbcccc" ===> "abc"
 */