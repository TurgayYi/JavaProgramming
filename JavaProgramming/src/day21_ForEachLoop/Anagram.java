package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println("ch1 = " + Arrays.toString(ch1));//ch1 = [a, c, d, b]
        System.out.println("ch2 = " + Arrays.toString(ch2));//ch2 = [d, b, c, a]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println("ch1 = " + Arrays.toString(ch1));//ch1 = [a, b, c, d]
        System.out.println("ch2 = " + Arrays.toString(ch2));//ch2 = [a, b, c, d]

        System.out.println(Arrays.equals(ch1,ch2));





    }

}
