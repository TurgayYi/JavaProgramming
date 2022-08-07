package day18_NestedLoop.day20_Arrays;

public class AppearTwice {

    public static void main(String[] args) {


        char[] chars = { 'A', 'A', 'A', 'B', 'C','C', 'D', 'D', 'B', 'D', };

        for (int j = 0; j < chars.length; j++) {
            char element = chars[j];
            int frequency = 0;

            for (int i = 0; i < chars.length; i++) {
                if(chars[i] == element){

                    frequency++;
                }


            }

            if(frequency == 2){

                System.out.println(""+ element + frequency);
            }

        }





    }

}
