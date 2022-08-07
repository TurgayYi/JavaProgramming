package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        System.out.println("employee1 = " + employee1);
        
        Employee employee2 = new Employee("Yuliya",'F');
        System.out.println("employee2 = " + employee2);
        
        Employee employee3 = new Employee("Olga",'F',"QA");
        System.out.println("employee3 = " + employee3);



    }


}
