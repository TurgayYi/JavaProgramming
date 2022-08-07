package day39_Recap.scrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void code(){
        System.out.println(getName() + " is coding");
    }



}
