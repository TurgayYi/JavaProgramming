package day47_Polymorphism;

import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shapeTask.Circle;
import day45_Abstraction.shapeTask.Shape;

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




    }
}
