package day39_Recap.deviceTask;

public class Iphone extends Phone{

    public Iphone( String model, double price, boolean hasBattery) {
        super("IPhone", model, price, hasBattery);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() + " is face timing with" + phoneNumber);
    }


    public void faceTime(String email){
        System.out.println(getBrand() + " " + getModel() + " is face timing with " + email);
    }


}
