package day14_String;

import java.nio.charset.StandardCharsets;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "            batch 25                 ";
        str1.trim();// "batch 25"

        System.out.println(str1);//"            batch 25                 "

        str1 = str1.trim();

        System.out.println(str1);//"batch 25"


        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");// you may use 'h'
        System.out.println(n1);

        int n2 = str2.indexOf("o");
        System.out.println("n2 = " + n2);
        
        int n3 = str2.indexOf("ool");
        System.out.println("n3 = " + n3);


        String str3 = "Java Programming Language";

        int n4 = str3.indexOf("a ");// to find the index number of second "a
        int n5 = str3.indexOf("am");//to find the index number of third "a
        int n6 = str3.indexOf("g"); // index number of first "g"
        int n7 = str3.indexOf("gua"); // index number of third "g"


        int n8 = str3.lastIndexOf("g"); // index number of last "g"
        System.out.println("n8 = " + n8);


        System.out.println("---------------------------------------------");

        String s = "Java Nova Cava Nawa orange";

        int firstA = s.indexOf("a"); // first "a"
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a N");
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("ava Na");
        int fourthA = s.lastIndexOf("av");
        int fifthA = s.lastIndexOf("va");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");
        int eighthA = s.lastIndexOf("a");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);
        System.out.println("eighthA = " + eighthA);




    }
}
