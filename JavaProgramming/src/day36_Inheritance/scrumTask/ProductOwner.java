package day36_Inheritance.scrumTask;

public class ProductOwner extends Employee{

    public void meet(){
        System.out.println(getJobTitle()+" "+ getName() + " is conducting a meeting with the customer" );
    }

}
