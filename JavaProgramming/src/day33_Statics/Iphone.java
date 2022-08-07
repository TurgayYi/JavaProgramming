package day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price;

    public static String oS= "IOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasCamera= true;

    public static boolean hasFaceTime = true;


    /*
    public static void printModelAndPrice(){
        System.out.println(model + " : " + price);// static methods  does not accept instances
    }

       public void method(){
        System.out.println(model + " : " + price);
        System.out.println(oS); // instance method accepts both static and instance

     */

    public static void printModelAndPrice(){
        System.out.println(oS);




    }






}
