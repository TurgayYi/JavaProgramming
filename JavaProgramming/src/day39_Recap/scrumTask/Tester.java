package day39_Recap.scrumTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }


    public void test(){
        System.out.println(getName() + " is testing the app");
    }


}
