package day34_GarbageCollection_AccesModihiers;

import day33_Statics.Car;
import day33_Statics.Dog;
import day33_Statics.Student;
import day33_Statics.*;

import java.util.ArrayList;
import java.util.Arrays;


public class GarbageCollection {

    public static void main(String[] args) {

        /*
        //int n = null;
        String str = null;// null is not an object and does not have memory inthr java heap

        System.out.println(str.toUpperCase());// String methods are for instances- there must be an object
         */

        String str = "Wooden Spoon";// after line 14, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println(str);




        Car car1 = new Car("Toyota");

        System.out.println(car1);
        car1 = null;

        System.out.println(car1);

        System.out.println("-------------------------------------------------");



        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        System.out.println(dog1);

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);


        String language = "Python";

        language = "Java";


        System.out.println("-----------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);


        ArrayList<Integer> list2 = list1;
        list2.addAll(Arrays.asList(20,30,40));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2);

        System.out.println("-----------------------------------------");

        Student student1 = new Student("Tahir",'M',24,14,'B');
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-----------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");



        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);





    }






}
