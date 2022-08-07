package day15_ForLoop;


public class StringMethods {
    public static void main(String[] args) {

        String str = " "; // false
        boolean r = str.isEmpty();

        System.out.println(r);

       boolean r1 = str.isBlank();

        System.out.println(r1);// true (when there is only white spaces)

        String str2 = "       ";

        boolean r3 = str2.isBlank();
        boolean r4 = str2.isEmpty();

        System.out.println(r3);//true
        System.out.println(r4);//false

        System.out.println("-------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("----------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains(("Java"));
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasCSharp);//false
        System.out.println(hasJava);// true
        System.out.println(hasJava2);// false
        System.out.println(hasJava3);// true

        System.out.println("---------------------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false
        System.out.println(input1.contains(input2));//true

        System.out.println("---------------------------");

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");
        //in order to ignore the case sensitivity we first create the lower case or upper case version of string then compare it with lowercase/uppercase

        System.out.println(x);//true
        System.out.println(y);//true
        System.out.println(z);//true






    }
}
