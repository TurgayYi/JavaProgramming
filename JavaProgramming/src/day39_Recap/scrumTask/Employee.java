package day39_Recap.scrumTask;

public class Employee extends Person{

    private int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.out.println("Invalid salary " + salary);
        }

        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
2. Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
				 sets the name, age, gender, id, jobTitle and salary of Employee Object


				work()

				toString(): generate toString seperately in Employee class so that
				name, age, gender, id, jobTitle and salary of the emplyee can be displayed


 */