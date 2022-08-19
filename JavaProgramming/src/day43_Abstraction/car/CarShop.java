package day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {
       // Car car = new Car("Cydeo","25","Blue",2022,10000);
        //we can not create object from abstract class, because abstract class is not concrete
        Honda honda = new Honda("Civic","White",2019,30000);
        Audi audi = new Audi("Q7","Blue",2020,20000);
        Tesla tesla = new Tesla("Model3","White",2021,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Black");

        honda.setPrice(31000);
        audi.setPrice(45000);
        tesla.setPrice(55000);

        System.out.println("---------------------------");
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }
}
