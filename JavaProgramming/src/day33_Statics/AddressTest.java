package day33_Statics;

public class AddressTest {

    public static void main(String[] args) {

        /*
        Address address1 = new Address();
        address1.city ="Istanbul";
        address1.buldingNumber= 58;
        address1.state = "VA";
        address1.street = "Istiklal";
        address1.zipCode = "34100";


         */
        Address address1 = new Address();
        address1.setInfo(58,"Istiklal Caddesi", "Istanbul","VA","34100");

        System.out.println(address1);






    }



}
