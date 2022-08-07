package day36_Inheritance.scrumTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public void setInfo(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <0 || age > 100){
            return;
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')){
            return;
        }
        this.gender = gender;
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }



    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';

    }


}
/*
ScrumTeam Task:
	1. Create a class named Person
			variables:
				name, age, gender

			methods:
				setInfo(): sets the name, age, gender of person
				eat(String food)
				drink(String drink)
				toString()
 */