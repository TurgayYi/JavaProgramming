package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {

        String name = "Jimmy Joe";
        String address = "79225 Jones Branch Dr";
        String city = "McLean";
        String state = "VA";

        String zipCode = "344423";

        String shippingAddress = name + "\n"+ address + "\n" + city + " " + state + " " + zipCode;

        /*
                String name = "Jimmy Joe",
                address = "79225 Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "344423",
                shippingAddress = name + "\n"+ address + "\n" + city + " " + state + " " + zipCode;
         */

        System.out.println(shippingAddress);





    }
}
