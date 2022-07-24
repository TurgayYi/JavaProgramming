package week12;

import java.util.ArrayList;

public class Microsoft {

    public static void main(String[] args) {

        Employee employeeOne = new Employee();


        System.out.println(employeeOne);

        employeeOne.name = "Semih";
        employeeOne.ID = 123;
        employeeOne.jobTitle = "Technical Manager";
        employeeOne.salary = 20000;



        Employee employeeTwo = new Employee("Ali","QA",233,13000);

        ArrayList<Employee> team = new ArrayList<>();

        team.add(employeeOne);
        team.add(employeeTwo);

        team.add(new Employee("Jamal","SDET",323,16000));

        // find the max salary


        double maxSalary = Double.MIN_VALUE;


        for(Employee each : team){

            if(each.salary > maxSalary){
                maxSalary = each.salary;
            }

        }

        System.out.println(maxSalary);


    }





}
