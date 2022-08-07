package day36_Inheritance.encapsulation.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 =  new  Dog("Alex","Husky",'M',3,"Large","White");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Love","Siamese",'F',2,"Small","Black");
        System.out.println(cat1);
        cat1.scratch();
        //cat.bark();

        Parrot parrot1 = new Parrot("King","Macaw",'M',3,"Small","White");
        System.out.println(parrot1);
        parrot1.sing();
        parrot1.drink();



    }



}
