package day12_Scanner;

import java.util.Scanner;

public class NextLineMethodPractise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = scan.nextInt();

        scan.nextLine();//Enter

        System.out.println("Enter your full name :");
        String fullName = scan.nextLine();

        System.out.println("Enter your GPA");
        double gpa = scan.nextDouble();

        scan.nextLine(); //Enter

        System.out.println("Enter your school name");
        String schoolName = scan.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("schoolName = " + schoolName);





        scan.close();




    }


}
/*

Ask the user to enter age(nextInt)
Ask the user to enter full name(nextLine)
 */
