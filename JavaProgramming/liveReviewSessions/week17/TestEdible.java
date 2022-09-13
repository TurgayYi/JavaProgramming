package week17;

public class TestEdible {
    public static void main(String[] args) {

        //Object[] objects = {new Tiger(), new Chicken(), new Apple()};


        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();

        Apple apple = new Apple();

        Object [] objects = {tiger,chicken,apple};
        tiger.sound();
        chicken.sound();
        chicken.howToEat();
        apple.howToEat();

        Edible.staticMethod();
        





    }
}

interface Edible{
    String howToEat();

    default void someMethod(){
        System.out.println("I am from Interface, default method");
    }

    static void staticMethod(){
        System.out.println("I am static method from interface");
    }

}

abstract class Animal{
    public abstract String sound();
}

class Chicken extends Animal implements Edible{


    public String howToEat() {
        return "Chicken : fry it";
    }


    public String sound() {
        return "Chicken : cock-a-doodle-do";
    }


}

class Tiger extends Animal{


    public String sound() {
        return "Tiger : Roars";
    }

}

abstract class Fruit implements Edible{

}

class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "Make apple cider and drink";
    }


}

class Orange extends Fruit{
    public String howToEat() {
        return "Orange : Make orange juice";
    }


}