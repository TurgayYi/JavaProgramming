package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana",'F',23,123000);

        System.out.println(employee1);

        employee1.setAge(30);

        System.out.println(employee1);

        Employee employee2 =new Employee("Aygun",'F',32,123000);

        employee2.setSalary(employee2.getSalary() + 15000);

        System.out.println(employee2);


    }



}
