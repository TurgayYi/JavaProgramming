package day14_String;

import java.util.Scanner;

public class DomainOfEmail_Substring {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email :");

        String email = scan.next();

        String domain1 = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println("domain1 = " + domain1);

        System.out.println("--------------------------------------");

        String str1 = "Java is fun, Java is cool";

        String s1 = str1.substring(0,str1.indexOf(","));//Java is fun
        String s2 = str1.substring(str1.indexOf(" J" )+1);//Java is cool
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);







    }
}
/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */