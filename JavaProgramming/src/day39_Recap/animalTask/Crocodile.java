package day39_Recap.animalTask;

public class Crocodile extends WildAnimal{

    public Crocodile(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void hunt(){
        System.out.println(getBreed() + " " + getName() + " is hunting zebra");
    }

    public void swim(){
        System.out.println(getBreed() + " " + getName() + " is swimming");
    }



}

