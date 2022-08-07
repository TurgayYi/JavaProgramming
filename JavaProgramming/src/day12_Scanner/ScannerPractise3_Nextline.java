package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise3_Nextline {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name : ");

        String name = scan.nextLine();


        System.out.println("Enter your programming language : ");
        String programming = scan.nextLine();

        System.out.println("Enter your age :");
        int age = scan.nextInt();

        scan.nextLine(); // capture the enter key that user pressed for netInt()

        System.out.println("Enter your school name :");
        String schoolName = scan.nextLine();

        System.out.println("name = " + name);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        scan.close();



    }


}
