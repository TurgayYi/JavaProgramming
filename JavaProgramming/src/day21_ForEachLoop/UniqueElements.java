package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Lyan", "Lyan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words) {

            int count = 0;

            for (String word : words) {

                if(word.equals(each)){
                    count++;

                }

            }
            if(count==1){

                System.out.println(each);

            }


        }






            }

        }





