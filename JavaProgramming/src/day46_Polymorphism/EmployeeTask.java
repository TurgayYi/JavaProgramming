package day46_Polymorphism;

import day43_Abstraction.employee.Developer;
import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Tester;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTask {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        };


        List<Employee> scrumMembers = new ArrayList<>();
        List<Tester> testers = new ArrayList<>();
        List<Developer> developers = new ArrayList<>();


        double maxTesterSalary = Double.MIN_VALUE;
        double minDeveloperSalary = Double.MAX_VALUE ;

        for (Employee employee : employees) {
            scrumMembers.add(employee);

            if(employee instanceof Tester){
                testers.add((Tester) employee);
            }
            if(employee instanceof Developer){
                developers.add((Developer) employee);
            }

            if(employee instanceof Tester && employee.getSalary()>maxTesterSalary){
                maxTesterSalary = employee.getSalary();
            }

            if(employee instanceof Developer && employee.getSalary()<minDeveloperSalary){
                minDeveloperSalary = employee.getSalary();
            }

        }

        System.out.println(scrumMembers);
        System.out.println(testers);
        System.out.println(developers);


        for (Tester tester : testers) {
            if(tester.getSalary() == maxTesterSalary){
                System.out.println("Tester " + tester.getName() + " has the minimum salary : $" + tester.getSalary());
            }
        }

        for (Developer developer : developers) {
            if(developer.getSalary() == minDeveloperSalary){
                System.out.println("Developer " +developer.getName() + " has the maximum salary : $" + developer.getSalary());
            }
        }











    }
}
/*
2. Given the following array that contains Employee objects:
			Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Developer("Zuhal", 27, 'F', 2, "Java Developer", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Developer("Cristina", 23, 'F',4, "Software Developer", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Developer("Gulistan",  26, 'F',6, "Web Developer", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Developer("Cassendra",  29, 'F',8, "Front-end Developer", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Developer("Sophie",  26, 'F',10, "Back-end Developer", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Developer("Fady",  26, 'F',12, "Full Stack Developer", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Developer("Enes",  26, 'M',14, "Full Stack Developer", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        	};

    		(import them from day43 package)

	   	2.1 store all the developers & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();

        2.3 store all the developers into the following List of developers:
        		List<Developer> developers = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?

 */