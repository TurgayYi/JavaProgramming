package day44_Abstraction.carTask;

public class Honda extends Car {

    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    public void start() {
        System.out.println(getColor()+" "+getYear()+" "+ getMake() + " " + getModel() + " is started" );

    }


    public void drive() {
        System.out.println("He is driving " + getColor()+" "+getYear()+" "+ getMake() + " " + getModel()  );
    }




}
/*
6. Create a sub class of Car named Honda
 */