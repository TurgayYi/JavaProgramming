package day33_Statics;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Semih",11,'M');

        Person person2 = new Person("Azra",12,'F');


        person1.drink("cola");
        person2.sleep();

        System.out.println(person1);



    }


}
