package day31_Constructors;

public class SalaryCalculator {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHour;


    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHour) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate/100;
        this.federalTaxRate = federalTaxRate/100;
        this.weeklyHour = weeklyHour;
    }

    public double  salary(){

        double salary =  hourlyRate * weeklyHour * 52;
        return salary;

    }

    public double stateTax(){
        double stateTax = salary()*stateTaxRate;

        return stateTax;
    }

    public double federalTax(){

        double federalTax = salary()*federalTaxRate;
        return federalTax;
    }

    public double salaryAfterTax(){

        double salaryAfterTax = salary()-federalTax()-stateTax();
        return salaryAfterTax;

    }

    public String toString() {

        return "SalaryCalculator{" +
                "Salary= $" + salary() +
                ", State Tax = $" + stateTax() +
                ", Federal Tax= $" + federalTax() +
                ", Salary After Tax= $" + salaryAfterTax() +
                '}';

    }


}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */