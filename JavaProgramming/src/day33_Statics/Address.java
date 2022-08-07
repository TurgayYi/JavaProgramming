package day33_Statics;

public class Address {

    public  String street, city, state, zipCode;
    public int buldingNumber;
    public static String country = "Turkiye";
    public static String planet = "Earth";

    public void setInfo(int buildingNumber,String street, String city, String state, String zipCode) {
        this.buldingNumber=buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return buldingNumber + " " + street + "\n" + city + country + ", "+zipCode;
    }
}
/*
		1. Create a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */