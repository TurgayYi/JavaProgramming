package day27_WrapperClasses;

public class NumOfUpperAndLowerCase {

    public static void main(String[] args) {

       String  str = "JAVA java";

       int upper = 0;
       int lower = 0;

        for (char each : str.toCharArray()) {
            if(Character.isUpperCase(each)){
                upper ++;
            }
            if(Character.isLowerCase(each)){
                lower ++;
            }
        }

        System.out.println(upper == lower);



    }



}
/*

4. Write program that returns true if the total number of upper case characters
are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

 */