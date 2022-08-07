package day37_Inheritance.phoneTask;



public class PhoneShop {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Apple","Iphone12","6.7",1000,"Black");

        Samsung samsung = new Samsung("Samsung", "Galaxy 12", "6inc",900,"White");

        Nokia nokia = new Nokia("Nokia","Brick", "4 inc", 500,"Gray");

        System.out.println("iPhone = " + iPhone);
        System.out.println("samsung = " + samsung);
        System.out.println("nokia = " + nokia);

        iPhone.call(911);
        iPhone.text(988819238);
        iPhone.faceTime(890293843);
        iPhone.faceTime("ali@gmail.com");


        samsung.call(911);
        samsung.text(23142423);
        samsung.freeze();


        nokia.call(911);
        nokia.text(23434242);
        nokia.selfDefense();


    }



}
