package day39_Recap.deviceTask;

public class Device {

    private String brand, model;

    private double price;

    private boolean hasBattery;

    public static boolean hasPowerButton = true;


    public Device(String brand, String model, double price, boolean hasBattery) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null || brand.isBlank() || brand.isEmpty()){
            System.out.println("Invalid brand " + brand);
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || model.isBlank() || model.isEmpty()){
            System.err.println("Invalid model " + model);
            System.exit(1);
        }

        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Invalid price " + price);
            System.exit(1);

        }

        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void turnOn(){
        System.out.println(brand + " " + model + " is turning on");
    }


    public void turnOff(){
        System.out.println(brand + " " + model + " is turning off");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';


    }


}

/*
Device Task:
	1. Create a class named Device:
			Variables:
					brand, model, price, hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model can not be null (if obj == null means it's error)
							2. brand, model can not be empty or can not be blank
							3. price can not be set to negative or zero

			Methods:
				turnOn(), turnOff(), toString()
 */