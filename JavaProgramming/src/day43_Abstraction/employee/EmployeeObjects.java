package day43_Abstraction.employee;

public class EmployeeObjects {
    public static void main(String[] args) {

       // Person person = new Person("John",35,'M');
       // Employee employee = new Employee("Ali",23,'M');

        Tester tester = new Tester("Ali",34,'M',23,"SDET",120000);
        Developer developer = new Developer("veli",43,'M',33,"Senior",145000);
        Teacher teacher = new Teacher("Azra",23,'F',36,"Math Teacher",145000);
        Driver driver = new Driver("Busra",44,'F',44,"Truckk Driver",110000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(driver);

        System.out.println("-----------------------------------");

        developer.work();
        developer.sleep();
        developer.unitTest();
        System.out.println("-----------------------------------");

        teacher.work();
        teacher.sleep();

        System.out.println("-----------------------------------");
        tester.work();
        tester.sleep();
        tester.bugReport();


    }


}
