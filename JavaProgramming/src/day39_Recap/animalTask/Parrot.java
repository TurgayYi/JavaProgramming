package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal{
    public Parrot(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void eat(){
        System.out.println(getBreed() + " " + getName() + " is eating sunflower seed");
    }

    public void fly(){
        System.out.println(getBreed() + " " + getName() + " is flying");
    }
    public void sing(){
        System.out.println(getBreed() + " " + getName() + " is singing");
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