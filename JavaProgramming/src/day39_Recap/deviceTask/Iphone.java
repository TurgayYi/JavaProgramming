package day39_Recap.deviceTask;

public class Iphone extends Phone{

    public Iphone(String brand, String model, double price) {
        super(brand, model, price);
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " " + getModel() + " is face timing with" + phoneNumber);
    }


    public void faceTime(String email){
        System.out.println(getBrand() + " " + getModel() + " is face timing with " + email);
    }


}
