package day36_Inheritance.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();
        iPhone.setInfo("IPhone","13 Max Pro","Large",35000,"Red");
        System.out.println(iPhone);
        iPhone.faceTime(123456);
        iPhone.faceTime("ali@gmail.com");
        iPhone.text(345678);


        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung","Note9","Large",3400,"Gray");
        System.out.println(samsung);
        samsung.freeze();
        samsung.call(234567);



        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia","3210","Small",10000,"White");
        System.out.println(nokia);
        nokia.selfDefense();
        nokia.text(987630);







    }




}
/*
1.5 Create a class named Phone Objects and test of the sub class' objects
 */