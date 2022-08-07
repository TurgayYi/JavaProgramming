package day09_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {

        int salary = 75000;
        double salaryAfterTax = 0;
        boolean isMarried = true;

        if (salary >= 130000) {
            if (isMarried) {
                salaryAfterTax = salary - salary * 0.30;
            } else {
                salaryAfterTax = salary - salary * 0.35;

            }
        } else if (salary >= 100000 ) {
            if (isMarried) {
                salaryAfterTax = salary - salary * 0.25;
            } else {
                salaryAfterTax = salary - salary * 0.30;
            }
        } else if (salary >= 80000) {
            if (isMarried) {
                salaryAfterTax = salary - salary * 0.20;
            } else {
                salaryAfterTax = salary - salary * 0.25;
            }
        } else {
            if (isMarried) {
                salaryAfterTax = salary - salary * 0.15;
            } else {
                salaryAfterTax = salary - salary * 0.20;
            }

        }
        System.out.println("salaryAfterTax = " + salaryAfterTax);

        System.out.println("--------------------------------------------");

        double salary1 = 75000;
        boolean isMarried1 = true;

        double taxRate = 0;

        if(salary1>= 130){
            taxRate = 0.35;
        }else if(salary1>=100000){
            taxRate = 0.30;
        }else if(salary1>=80000){
            taxRate = 0.25;
        }else{
            taxRate = 0.20;
        }

        if(isMarried1){
            taxRate -=0.05;
        }

        double salaryAfterTax1 = salary1- salary1 * taxRate;

        System.out.println(salaryAfterTax1);


    }
}

/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax

 */
