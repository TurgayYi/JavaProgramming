package day18_NestedLoop.day20_Arrays;

public class Reverse {

    public static void main(String[] args) {

        String[] clasmates = {"Azra Yildirim", "Semih Yildirim", "Ecrin Yildirim", "Büşra Yildirim", "Batuhan Özdemir",
                "Nisa Nur", "Melisa Özdemir","Mustafa Yildirim","Muhammed Ağa", "Cemile Man" };

        for (int i = 0; i < clasmates.length; i++) {

            String reverse="";
            for (int j = clasmates[i].length() -1; j >= 0  ; j--) {
                reverse += clasmates[i].charAt(j);


            }

            System.out.println(reverse);



        }





    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
                    ex:
        arr = {java, python, c#}

        output:
        avaJ
        nohtyp
        #c

 */