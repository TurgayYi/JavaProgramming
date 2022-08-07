package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setInfo("Max","Husky",'M',2,"Small","Brown");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();


        Cat cat = new Cat();
        cat.setInfo("Leo","British",'M',3,"Large","White-Black");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();
        cat.meow();

        //cat.bark();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Kan", "Bengal",'M',4,"Large","Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();



    }


}
