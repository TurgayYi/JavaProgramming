package day44_Abstraction.carTask;

public class Tesla extends Car implements AutoPilot{

    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    public void autoPark() {
        System.out.println(getModel() + " can auto park");
    }


    public void selfDrive() {
        System.out.println(getModel() + " has sef drive feature");
    }


    public void start() {

        System.out.println(getModel() + " is started");

    }


    public void drive() {
        System.out.println("He is driving " + getYear() + " " + getModel());

    }


}
