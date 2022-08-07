package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your hourly rate :");
        int hourlyRate = scan.nextInt();

        System.out.println("How many hours do you work in a week");
        int hour = scan.nextInt();

        System.out.println("Enter state tax (in percentage)");
        double stateTax = scan.nextDouble();

        System.out.println("Enter federal tax (in percentage)");
        double federalTax = scan.nextDouble();

        int salary =hourlyRate * hour * 52;
        double totalTax = (federalTax + stateTax)/100;

        System.out.println("Salary = " + salary);
        System.out.println("State Tax = " + stateTax / 100 );
        System.out.println("Federal Tax = " + federalTax/100);
        System.out.println("Total Tax = " + (federalTax + stateTax)/100);
        System.out.println("Net income = " + salary * (1- totalTax) );

        scan.close();






    }
}
/*
    3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */