package day39_Recap.deviceTask;

public class MyDevices {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("13 Pro",34000);

        Samsung samsung =new Samsung("Note 10", 30000);

        Blackberry blackberry = new Blackberry("45t",2300);

        Google google = new Google("G70",2300);

        Nokia nokia = new Nokia("N90",200);

        PersonalComputer personalComputer = new PersonalComputer("HP","EliteBook",70000,true);

        Desktop desktop = new Desktop("Casper","rt32",23450);

        Laptop laptop = new Laptop("Apple","MacPro",45000);

        TV tv = new TV("LG","L3400",4500,false);


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
        System.out.println(google);
        System.out.println(blackberry);

        System.out.println(personalComputer);
        System.out.println(desktop);
        System.out.println(laptop);

        tv.channelDown();
        iphone.faceTime("ali@gmail.com");













    }





}
