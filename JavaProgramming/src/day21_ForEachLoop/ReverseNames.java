package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] clasmates = {"Azra Yildirim", "Semih Yildirim", "Ecrin Yildirim", "Büşra Yildirim", "Batuhan Özdemir",
                "Nisa Nur", "Melisa Özdemir","Mustafa Yildirim","Muhammed Ağa", "Cemile Man" };

        for (String each : clasmates) {

            String[] ch = each.split("");
            String reversed = "";

            for (int i = ch.length - 1; i >= 0; i--) {

                reversed+=ch[i];
            }

            System.out.println(reversed);


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