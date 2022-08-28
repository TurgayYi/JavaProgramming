package day44_Abstraction.carTask;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    public void start() {
        System.out.println(getColor()+" "+getYear()+" "+ getMake() + " " + getModel() + " is started" );

    }


    public void drive() {
        System.out.println("He is driving " + getColor()+" "+getYear()+" "+ getMake() + " " + getModel()  );
    }



    public void autoPark() {
        System.out.println(getModel() + " " + getYear() + " can auto park");
    }


}
