package day36_Inheritance.phoneTask;

public class IPhone extends Phone{

    public void faceTime(long phoneNumber){
        System.out.println(brand + " " + model + " is face timing with" + phoneNumber);
    }


    public void faceTime(String email){
        System.out.println(brand + " " + model + " is face timing with " + email);
    }


}
/*
		1.2 Create a sub class of Phone named IPhone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString()

 */