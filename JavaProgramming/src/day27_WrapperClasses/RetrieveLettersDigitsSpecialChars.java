package day27_WrapperClasses;

public class RetrieveLettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        String letters= "";
        String digits = "";
        String specialChars = "";

        for (char each : str.toCharArray()) {

            if(Character.isLetter(each)){
                letters += each;
            }else if (Character.isDigit(each)){
                digits+=each;
            }else{
                specialChars += each;
            }


        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);



    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */