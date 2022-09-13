package day46_Polymorphism;



import day43_Abstraction.employee.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;
import day45_Abstraction.shapeTask.*;

import java.util.ArrayList;

public class PolymorphismIntro {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        Integer n1 = 2;
        Double n2 = 5.5;
        Boolean r1 = true;

        //String [] array = {str, n1,n2,r1};



        Employee tester = new Tester("Ali",34,'M',23,"SDET",120000);
        Employee developer = new Developer("veli",43,'M',33,"Senior",145000);
        Employee teacher = new Teacher("Azra",23,'F',36,"Math Teacher",145000);
        Employee  driver = new Driver("Busra",44,'F',44,"Truckk Driver",110000);


        ArrayList<Employee> cydeoEmployees = new ArrayList<>();

        cydeoEmployees.add(tester);
        cydeoEmployees.add(teacher);
        cydeoEmployees.add(driver);
        cydeoEmployees.add(developer);

        System.out.println("----------------------------------------------------------------");

        Employee employee = new Tester("Ali",34,'M',23,"SDET",120000);

        employee.work();
        //employee.bugReport(); //since the bugReport () is not in Employee Class we can not call the method by using reference Type(Employee)
        //we have to use object Type (Tester)

        Animal animal = new Dog("Max", "Husky",'M',3,"Large","White");
        animal.drink();
        animal.eat();
        //animal.bark(); compile error;
        //animal.play() compile error


        //Interface Playable

        Playable animal2 =new Dog("Max", "Husky",'M',3,"Large","White");

        animal2.play();
       // animal2.drink();
        //animal2.eat();

        Shape shape = new Circle(4);
        shape.area();

        //System.out.println(shape.getRadius());
       //System.out.println(shape.getPI());


        boolean isSquare = shape instanceof Square;
        boolean isRectangle = shape instanceof Rectangle;
        boolean isTriangle = shape instanceof Triangle;
        boolean isCircle = shape instanceof Circle;

        System.out.println("isTriangle = " + isTriangle);//false
        System.out.println("isRectangle = " + isRectangle);//false
        System.out.println("isSquare = " + isSquare);//false
        System.out.println("isCircle = " + isCircle);//true


        /*

        driver :

        if(driver instanceof Chrome){
        Chrome browser will open
        }else is(driver instance of firefox){
        Firefox browser will open
        }


         */

















    }








}
