package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345#school!@%%&&@woodenSpoon";
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//ch:every single characters in str

            if(ch >='0' && ch <= '9'){
                digits += ch;
            }else if ((ch >='A' && ch <= 'Z')|| (ch >='a' && ch <= 'z')){
                letters += ch;
            }else{
                specialChars +=ch;
            }


        }
        System.out.println("specialChars = " + specialChars);
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);

    }



}
/*

 My solution day 15:
Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string :");
        String word = scan.next();

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < word.length() ; i++) {
            if(word.charAt(i) >= '0' && word.charAt(i)<= '9'){
                digits += word.charAt(i);

            }else if((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') ||(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')  ){
                letters += word.charAt(i);
            }else{
                specialChars += word.charAt(i);
            }


        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

        scan.close();



    }

}
/*
   5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

 */