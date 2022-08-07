package day37_Inheritance.phoneTask;

public class Phone {

    public String brand, model, size;
    public double price;
    public String color;

    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;

    }

    static {
        hasBattery =true;
    }

public void call(long phoneNumber){

    System.out.println(brand + " " + model + " is calling " + phoneNumber);

}


public void text(long phoneNumber){

    System.out.println(brand + " " + model + " is texting " + phoneNumber);
}


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';


    }


}

/*
1. Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add constructor

				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */