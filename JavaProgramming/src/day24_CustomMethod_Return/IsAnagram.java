package day24_CustomMethod_Return;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {
        String str1 = "cba";
        String str2 = "bac";

        boolean isAnagramStr1Str2 = isAnagram(str1,str2);

        System.out.println("Is anagram "+str1+" "+str2 +" = " + isAnagramStr1Str2);



    }

    public static boolean isAnagram(String str1, String str2){



        char[] chArr1= str1.toLowerCase().toCharArray();
        char[] chArr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(chArr1);
        Arrays.sort(chArr2);

        boolean isAnagram =Arrays.equals(chArr1,chArr2);


        return isAnagram;

    }




}

/*
    2. create a method named isAnagram that passes two String parameters,
    the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */