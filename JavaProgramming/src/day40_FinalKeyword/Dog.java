package day40_FinalKeyword;
public class Dog extends Animal{

    public Dog(String breed, char gender, String color, String size, int age) {
        super(breed, gender, color, size, age);
    }

    public void eat(){
        System.out.println(getName() + " is eating dog food");
    }

    public void bark(){
        System.out.println(getName() + " is barking");
    }

    /* since the drink () method is final, it can not be overridden
    public void drink(){
        System.out.println(getName() + " is eating dog drink");
    }
     */



}
