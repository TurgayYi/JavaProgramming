package day44_Abstraction.carTask;

public class CydeoCar extends Car implements AutoPilot,Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    public void start() {
        System.out.println(getColor()+" "+getYear()+" "+ getMake() + " " + getModel() + " is started" );

    }

    public void drive() {
        System.out.println("He is driving " + getColor()+" "+getYear()+" "+ getMake() + " " + getModel()  );
    }


    public void autoPark() {
        System.out.println(getModel() + " can auto park");
    }


    public void selfDrive() {
        System.out.println(getModel() + " has sef drive feature");
    }


    public void fly() {
        System.out.println(getModel() + " can fly");
    }


}
