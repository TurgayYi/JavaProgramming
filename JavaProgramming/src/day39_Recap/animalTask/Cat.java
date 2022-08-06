package day39_Recap.animalTask;

public class Cat extends FriendlyAnimal{

    public Cat(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat(){
        System.out.println(getBreed() + " " + getName() + " is eating cat food");
    }

    public void scratch(){
        System.out.println(getBreed() + " " + getName() + " is scratching");
    }

    public void meow(){
        System.out.println(getBreed() + " " + getName() + " is meowing");
    }
}
/*
	4. Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */