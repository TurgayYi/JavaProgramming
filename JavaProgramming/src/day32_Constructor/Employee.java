package day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;



    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, char gender){
        this(name);
        //Employee(name) - gives compile error, unless other methods within another constructors you can not call constructor by name, tou have to use keywordthis()
        //this.name = name;
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle){
        //this(name);
        //this.gender = gender;
        this(name,gender);
        this.jobTitle =jobTitle;

    }

    public Employee(String name, char gender, String jobTitle, double salary){

        this(name,gender,jobTitle);
        this.salary = salary;

    }



















    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';

    }



}
