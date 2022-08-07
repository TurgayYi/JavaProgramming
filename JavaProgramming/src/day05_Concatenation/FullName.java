package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Semih Turan";
        String lastName = "Yildirim";
        int age = 9;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 1000000.50;

        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName +". " + fullName + " is " + age + " years old." );

        // FullName is jobTittle, works at CompanyName

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and salary is $ " + salary);


    }
}
