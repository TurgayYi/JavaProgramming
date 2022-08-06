package day39_Recap.deviceTask;

public class Iphone extends Phone{

    public Iphone( String model, double price) {
        super("Apple", model, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() + " is face timing with" + phoneNumber);
    }


    public void faceTime(String email){
        System.out.println(getBrand() + " " + getModel() + " is face timing with " + email);
    }


}
