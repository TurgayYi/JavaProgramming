package day24_CustomMethod_Return;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Java";
        String reversedJava = reverse(str);

        System.out.println("reversedJava = " + reversedJava);

    }

    public static String reverse(String str){
        String reversed  = "";
        
        for (int i = str.length()-1; i >=0 ; i--) {
            
            reversed+=str.charAt(i);
            
        }
                
        return reversed;
    }



}

/*

	3. create a method named reverse that passes one string parameter,
	 the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */
