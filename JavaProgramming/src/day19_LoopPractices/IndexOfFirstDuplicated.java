package day19_LoopPractices;

import java.util.Scanner;

public class IndexOfFirstDuplicated {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int count = 0;
            if(count == 2){
                break;
            }

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch == each){
                    count++;
                }

            }

            if( (!(result.contains(""+ch))) && count>=2)
            {
                result +=ch;
                result +=count;

            }


        }
        System.out.println("Index number of the first character = " +str.indexOf(result.charAt(0)));


    }

}
