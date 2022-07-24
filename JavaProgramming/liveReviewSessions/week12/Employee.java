package week12;

public class Employee {
    public String name, jobTitle;
    public int ID;
    public double salary;
    public static String companyName;

    static {
        companyName = "Microsoft";
    }

    public Employee(){
        salary = 10000;
    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                ", companyName=" + companyName +
                '}';

    }


}
