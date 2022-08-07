package day35_Encapsulation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Ali",'T',32,-12);

        System.out.println(person1);

        person1.setGender('M');
        System.out.println(person1);

        person1.setSalary(123000);
        System.out.println(person1);



    }

}
