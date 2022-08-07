package day36_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee {

    public void project(){

        System.out.println(getJobTitle()+" "+ getName() + " is working on a new project" );
    }
}
