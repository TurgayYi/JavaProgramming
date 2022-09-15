package day47_Polymorphism;

import day43_Abstraction.employee.Developer;
import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Person;
import day43_Abstraction.employee.Tester;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shapeTask.Circle;
import day45_Abstraction.shapeTask.Shape;
import day45_Abstraction.shapeTask.Square;

public class ReferenceTypeCasting {




    public static void main(String[] args) {

        //Shape shape = (Shape) new Circle(4);//upcasting

        Shape shape2 = new Circle(4);

        Animal animal = new Dog("Max", "Husky",'M',3,"Large","White");

        Dog dog = (Dog) animal; // downcasting
        dog.bark();

        System.out.println(animal.getName());//Max
        System.out.println(dog.getName());//Max

        ((Dog) animal).bark();
        dog.bark();


        Shape shape1 = new Square(5);

        System.out.println(((Square) shape1).getSide());


        System.out.println("-------------------------------");


        Animal animal2 = new Cat("Jim","British",'M',3,"Small","White");

       //Cat cat = (Cat) animal2;
        //cat.meow();

        ((Cat) animal2).meow();

        // ( (Dog) animal2).bark();// it will give ClassCastException

        Employee employee = new Tester("Sherali", 32, 'M',1, "QA", 110000);

        ((Tester) employee).bugReport();

        //((Tester) employee).unitTest();
        ((Developer) employee).unitTest();//it will give ClassCastException

        //Driver driver = (Driver) employee;
        Person person = employee;
        //Teacher teacher = (Teacher) employee;

        System.out.println("-------------------------------");

        Shape s1 = new Circle(10);
        s1.area();

        //((Cube)s1).volume();





    }
}
