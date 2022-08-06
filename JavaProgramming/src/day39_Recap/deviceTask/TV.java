package day39_Recap.deviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean hasBattery) {
        super(brand, model, price, hasBattery);
    }

    public  void channelUp(){
        System.out.println(getBrand() + " " + getModel() + " is channel upping");
    }

    public  void channelDown(){
        System.out.println(getBrand() + " " + getModel() + " has channel downing");
    }



}
