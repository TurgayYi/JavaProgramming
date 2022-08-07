package day36_Inheritance.scrumTask;

public class ScrumMaster extends Employee{

    public void dailyMeeting(){
        System.out.println(getJobTitle()+" "+ getName() + " is participating daily stand up meeting" );
    }
}
