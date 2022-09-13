package day46_Polymorphism;

import day31_Constructors.Rectangle;
import day33_Statics.Circle;
import day43_Abstraction.employee.*;

import java.util.ArrayList;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        Integer n1 = 2;
        Double n2 = 5.5;
        Boolean r1 = true;

        //String [] array = {str, n1,n2,r1};

        Object [] array = {str, n1,n2,r1,new Circle(5),new  Rectangle(3,5)};

        Employee tester = new Tester("Ali",34,'M',23,"SDET",120000);
        Employee developer = new Developer("veli",43,'M',33,"Senior",145000);
        Employee teacher = new Teacher("Azra",23,'F',36,"Math Teacher",145000);
        Employee  driver = new Driver("Busra",44,'F',44,"Truckk Driver",110000);


        ArrayList<Employee> cydeoEmployees = new ArrayList<>();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);
        cydeoEmployees.add(developer);




    }








}
