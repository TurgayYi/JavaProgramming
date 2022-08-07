package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        //replace(old value, new value)

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");//"Python is fun, I love learning Python";

        System.out.println("str2 = " + str2);
        System.out.println("str = " + str);

        System.out.println("---------------------------");

        String email = "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo" ,"gmail");

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        System.out.println("---------------------------");

        String sentence = "Java Java Python Python C# C# C+ C+ Python Python Python Python"; //remove python
        String sentence2 = sentence.replace("Python","").replace("   "," ");
        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        System.out.println("-----------------------------------");

        String s = "Dog Dog Dog Dog Dog Dog";//replace Dog with cat
        s = s.replace("Dog","Cat").toUpperCase();

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";//replace second C# with Java
        s2 = s2.replace(" C#"," Java");
        System.out.println("s2 = " + s2);
        
        
        String s3 = "Java";
        s3 = s3.replace("a","e");//Jeve
        System.out.println("s3 = " + s3);

        System.out.println("-----------------------------------------");

        String result ="Java Java Java";
        String result1 = result.replace("Java","Python");// Python Python Python
        String result2 = result.replaceFirst("Java","Python");//Python Java Java

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        System.out.println("---------------------------");

        String result3 ="C# is fun, C# is cool";
        result3 = result3.replaceFirst("C#","Java");// replace first C# with Java
        System.out.println("result3 = " + result3);






    }
}
