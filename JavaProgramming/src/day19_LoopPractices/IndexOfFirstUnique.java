package day19_LoopPractices;

import java.util.Scanner;

public class IndexOfFirstUnique {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                String each = ""+str.charAt(j);

                if(ch.equals(each)){
                    count++;
                }

            }
            if(result.contains(ch) || count>1){
                continue;
            }

            System.out.println("" + str.charAt(i)+ " " + i);

            break;

        }


            scan.close();

    }
}
/*
4. Write a program that can return the index number of the first unique character.
 */