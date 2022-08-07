package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Max","Husky",'M',2,"Small","Brown");
        System.out.println(dog1);
        dog1.bark();
        //dog1.sing();


        Cat cat1 = new Cat("Leo","British",'M',3,"Large","White-Black");
        System.out.println(dog1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("Sher Kan", "Bengal",'M',4,"Large","Orange");
        System.out.println(parrot1);
        parrot1.sing();



    }


}
