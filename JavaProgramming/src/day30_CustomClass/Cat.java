package day30_CustomClass;

public class Cat {

    public String name;
    public String breed;
    public int age;
    public String size;
    public char gender;
    public boolean illness;


    public void setInfo(String name, String breed, int age, String size, char gender, boolean illness) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.gender = gender;
        this.illness = illness;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", illness=" + illness +
                '}';
    }

    public void eat(){

        System.out.println(name + " is eating cat food.");

    }

    public void sleep(){

        System.out.println(name + "is sleeping.");

    }



}
